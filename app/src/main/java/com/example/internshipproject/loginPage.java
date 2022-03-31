package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class loginPage extends AppCompatActivity {

    Button login;
    TextInputEditText textInputEditTextUsername, textInputEditTextPassword;
    TextView signup;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        login = findViewById(R.id.btnlogin);
        textInputEditTextUsername = findViewById(R.id.username);
        textInputEditTextPassword = findViewById(R.id.password);
        progressBar = findViewById(R.id.progress);
        signup = (TextView) findViewById(R.id.btnsignup);
        signup.setPaintFlags(signup.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        signup.setOnClickListener(view -> {
            Intent intent = new Intent(loginPage.this, signUp.class);
            startActivity(intent);
        });

        login.setOnClickListener(v -> {
            String username, password;
            username = String.valueOf(textInputEditTextUsername.getText());
            password = String.valueOf(textInputEditTextPassword.getText());

            if( !username.equals("") && !password.equals("")) {
                progressBar.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.post(() -> {
                    String[] field = new String[2];
                    field[0] = "username";
                    field[1] = "password";
                    String[] data = new String[2];
                    data[0] = username;
                    data[1] = password;
                    PutData putData = new PutData("http://192.168.1.12/Internship/login.php", "POST", field, data);
                    if (putData.startPut()) {
                        if (putData.onComplete()) {
                            progressBar.setVisibility(View.GONE);
                            String result = putData.getResult();
                            if(result.equals("Login Successfully")){
                                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), homeActivity.class);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
            else{
                Toast.makeText(getApplicationContext(),"All fields required", Toast.LENGTH_LONG).show();
            }
        });

    }

}