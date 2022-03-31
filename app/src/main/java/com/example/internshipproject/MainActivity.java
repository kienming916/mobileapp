package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button aboutUs, loginpage, viewwinningproject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();

        LinearLayout animation = findViewById(R.id.interface1);
        AnimationDrawable testing = (AnimationDrawable) animation.getBackground();
        testing.setEnterFadeDuration(1000);
        testing.setExitFadeDuration(3000);
        testing.start();
    }

    private void findViews(){
        aboutUs = (Button) findViewById(R.id.btnaboutus);
        loginpage = (Button) findViewById(R.id.btnloginpage);
        viewwinningproject = (Button) findViewById(R.id.btnviewwinningproject);
    }

    private void setListeners(){
        aboutUs.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,aboutUs.class);
            startActivity(intent);
        });
        loginpage.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,loginPage.class);
            startActivity(intent);
        });
        viewwinningproject.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,viewWinningProject.class);
            startActivity(intent);
        });
    }
}