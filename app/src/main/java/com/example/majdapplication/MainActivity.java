package com.example.majdapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    Intent intent,int1;
    String ok="s";
    boolean entered=false;
    BottomNavigationView navMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navMenu=findViewById(R.id.bottomNavigationView);

        int1=getIntent();
        ok=int1.getStringExtra("boolvalue");
        navMenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.Dash){
                        int1=getIntent();
                        ok=int1.getStringExtra("boolvalue");

                    if("loged".equals(ok)){
                    intent=new Intent(MainActivity.this,DashBoard.class);
                    startActivity(intent);}}
                if(id==R.id.Login){
                    entered=true;
                    intent=new Intent(MainActivity.this,login.class);
                    startActivity(intent);
                }

                return true;
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }








    }
