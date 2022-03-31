package com.example.internshipproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.tabs.TabLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class registerCompetition extends AppCompatActivity {

    Button competitionrelatedinformation, registernow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_competition);
        findViews();
        setListeners();

        LinearLayout animation = findViewById(R.id.interfaceregistercompetition);
        AnimationDrawable testing = (AnimationDrawable) animation.getBackground();
        testing.setEnterFadeDuration(1000);
        testing.setExitFadeDuration(3000);
        testing.start();
    }

    private void findViews(){
        competitionrelatedinformation = (Button) findViewById(R.id.btncompetitionrelatedinformation);
        registernow = (Button) findViewById(R.id.btnregisternow);
    }

    private void setListeners(){
        competitionrelatedinformation.setOnClickListener(view -> {
            Intent intent = new Intent(registerCompetition.this,viewCompetitionDetails.class);
            startActivity(intent);
        });
        registernow.setOnClickListener(view -> {
            Intent intent = new Intent(registerCompetition.this,termsandconditions.class);
            startActivity(intent);
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(registerCompetition.this,homeActivity.class);
        intent.putExtra("finish", true); // if you are checking for this in your other Activities
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}