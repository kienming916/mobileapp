package com.example.internshipproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    Button register, submission, notification, checkstatus, logout;
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
        checkstatus = (Button) findViewById(R.id.btncheckstatus);
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
        checkstatus.setOnClickListener(view -> {
            Intent intent = new Intent(homeActivity.this,checkStatus.class);
            startActivity(intent);
        });
        logout.setOnClickListener(view -> {
            onBackPressed();
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

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(homeActivity.this,MainActivity.class);
                        intent.putExtra("finish", true); // if you are checking for this in your other Activities
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                                Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}