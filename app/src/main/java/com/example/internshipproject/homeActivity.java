package com.example.internshipproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    Button register, submission, notification, viewwinningproject, logout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViews();
        setListeners();

        LinearLayout animation = findViewById(R.id.interface7);
        AnimationDrawable testing = (AnimationDrawable) animation.getBackground();
        testing.setEnterFadeDuration(1000);
        testing.setExitFadeDuration(3000);
        testing.start();
    }
    private void findViews(){
        register = (Button) findViewById(R.id.btnregister);
        submission = (Button) findViewById(R.id.btnsubmission);
        notification = (Button) findViewById(R.id.btnnotification);
        viewwinningproject = (Button) findViewById(R.id.btnviewwinningproject);
        logout = (Button) findViewById(R.id.btnlogout);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigation);
        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
    }

    private void setListeners(){
        register.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,registerCompetition.class);
            startActivity(intent);
        });
        submission.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,uploadSubmission.class);
            startActivity(intent);
        });
        notification.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,notification.class);
            startActivity(intent);
        });
        viewwinningproject.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,viewWinningProject.class);
            startActivity(intent);
        });
        logout.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,loginPage.class);
            startActivity(intent);
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.profile){
            Intent intent = new Intent(homeActivity.this,profile.class);
            startActivity(intent);
        }
        return false;
    }
}