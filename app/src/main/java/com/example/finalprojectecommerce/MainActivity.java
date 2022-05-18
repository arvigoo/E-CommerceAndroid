package com.example.finalprojectecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Register(View view) {
        startActivity(new Intent(MainActivity.this,RegisterUser.class));
    }

    public void login(View view) {
        startActivity(new Intent(MainActivity.this,LoginUser.class));
    }

    public void loginadmin(View view) {startActivity(new Intent(MainActivity.this, LoginAdmin.class));
    }

    public void loginstaff(View view) {startActivity(new Intent(MainActivity.this, LoginStaff.class));
    }

    public void infotoko(View view) {startActivity(new Intent(MainActivity.this, aboutPages.class));
    }
}