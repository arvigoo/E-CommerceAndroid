package com.example.finalprojectecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void datastaff(View view) {
        startActivity(new Intent(Admin.this,DataStaff.class));
    }

    public void datastock(View view) {
        startActivity(new Intent(Admin.this,DataStock.class));
    }
}