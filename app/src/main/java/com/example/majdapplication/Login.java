package com.example.majdapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


    public class Login extends AppCompatActivity  {

    EditText us, pas;
    Button b1, b2, b3;

    SharedPreferences sharedPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        us = findViewById(R.id.us);
        pas = findViewById(R.id.pas);
        b1 = findViewById(R.id.log);
        b2 = findViewById(R.id.canc);
        b3 = findViewById(R.id.signup);

        sharedPrefs = getSharedPreferences("myPrefs", Context.MODE_PRIVATE);

        b1.setOnClickListener(view -> loginUser());

        b3.setOnClickListener(view -> registerUser());

        b2.setOnClickListener(view -> finish());
    }

    private void registerUser() {
        String username = us.getText().toString().trim();
        String password = pas.getText().toString().trim();

        if (!username.isEmpty() && !password.isEmpty()) {
            SharedPreferences.Editor editor = sharedPrefs.edit();
            editor.putString("username", username);
            editor.putString("password", password);
            editor.apply();

            Toast.makeText(this, "تم التسجيل بنجاح", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "يرجى ملء اسم المستخدم وكلمة المرور", Toast.LENGTH_SHORT).show();
        }
    }

    private void loginUser() {
        String inputUsername = us.getText().toString().trim();
        String inputPassword = pas.getText().toString().trim();

        String savedUsername = sharedPrefs.getString("username", null);
        String savedPassword = sharedPrefs.getString("password", null);

        if (savedUsername == null || savedPassword == null) {
            Toast.makeText(this, "الرجاء التسجيل أولاً", Toast.LENGTH_SHORT).show();
            return;
        }

        if (inputUsername.equals(savedUsername) && inputPassword.equals(savedPassword)) {
            Toast.makeText(this, "تم تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DashBoard.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "اسم المستخدم أو كلمة المرور غير صحيحة", Toast.LENGTH_SHORT).show();
        }
    }
}






