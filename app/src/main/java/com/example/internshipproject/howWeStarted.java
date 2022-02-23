package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class howWeStarted extends AppCompatActivity {

    Button back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_we_started);
        findViews();
        setListeners();
    }
    private void findViews() {
        back = (Button) findViewById(R.id.btnback);
        next = (Button) findViewById(R.id.btnnext);
    }
    private void setListeners(){
        back.setOnClickListener(view -> {
            Intent intent = new Intent(howWeStarted.this,aboutUs.class);
            startActivity(intent);
        });
        next.setOnClickListener(view -> {
            Intent intent = new Intent(howWeStarted.this,contactUs.class);
            startActivity(intent);
        });
    }
}