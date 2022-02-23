package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class aboutUs extends AppCompatActivity {
    Button back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        findViews();
        setListeners();
    }
    private void findViews() {
        back = (Button) findViewById(R.id.btnback);
        next = (Button) findViewById(R.id.btnnext);
    }
    private void setListeners(){
        back.setOnClickListener(view -> {
            Intent intent = new Intent(aboutUs.this,MainActivity.class);
            startActivity(intent);
        });
        next.setOnClickListener(view -> {
            Intent intent = new Intent(aboutUs.this,howWeStarted.class);
            startActivity(intent);
        });
    }
}