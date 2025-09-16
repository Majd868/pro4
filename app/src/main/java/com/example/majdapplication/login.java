package com.example.majdapplication;

import android.content.Intent;
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

public class login extends AppCompatActivity {

    EditText us;
    EditText pas;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        us=findViewById(R.id.us);
        pas=findViewById(R.id.pas);
        b1=findViewById(R.id.log);
        b2=findViewById(R.id.canc);
        b1.setOnClickListener(this::todash);

    }

    public void todash(View view) {
        //Intent intent1=new Intent(this,MainActivity.class);//
        if(us.getText().toString().equals("majd") && pas.getText().toString().equals("456")){
            Toast.makeText(this, "WORKING", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,DashBoard.class);

            startActivity(intent);

        }

}
    public void cancel(View view) {

        finish();
    }
}
