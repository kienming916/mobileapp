package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class contactUs extends AppCompatActivity {
    Button back, homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        findViews();
        setListeners();
    }
    private void findViews() {
        back = (Button) findViewById(R.id.btnback);
        homepage = (Button) findViewById(R.id.btnhomepage);
    }
    private void setListeners(){
        back.setOnClickListener(view -> {
            Intent intent = new Intent(contactUs.this,howWeStarted.class);
            startActivity(intent);
        });
        homepage.setOnClickListener(view -> {
            Intent intent = new Intent(contactUs.this,MainActivity.class);
            startActivity(intent);
        });
    }
}