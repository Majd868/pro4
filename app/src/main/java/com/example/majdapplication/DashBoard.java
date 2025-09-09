package com.example.majdapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashBoard extends AppCompatActivity {

     Button btn,btn2;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
    btn=findViewById(R.id.exit);
   btn2=findViewById(R.id.logout);
   btn.setOnClickListener(this::s);
        btn2.setOnClickListener(this::s);
    }
    public void onClick(View view){

    }
public void s(View view){
    int id =view.getId();
    if(id ==R.id.logout)
        intent=new Intent(this,MainActivity.class);
    startActivity(intent);
    if(id ==R.id.exit)
        System.exit(0);
}
    }
