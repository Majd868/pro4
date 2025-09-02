package com.example.majdapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {
    EditText us=findViewById(R.id.us);
    EditText pas=findViewById(R.id.pas);
    Button b1=findViewById(R.id.Login);
    Button b2=findViewById(R.id.canc);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void todash(View view) {
        Intent intent=new Intent(this,DashBoard.class);
        startActivity(intent);}

    public void cancel(View view) {
        finish();
    }
}
