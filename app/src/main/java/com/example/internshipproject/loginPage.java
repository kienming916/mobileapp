package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    Button login;
    EditText username, password;
    TextView forgotpassword, signup;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        findViews();
        setListeners();
    }
    private void findViews(){
        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        forgotpassword = (TextView) findViewById(R.id.btnforgotpass);
        forgotpassword.setPaintFlags(forgotpassword.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        signup = (TextView) findViewById(R.id.btnsignup);
        signup.setPaintFlags(signup.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        DB = new DBHelper(this);
    }

    private void setListeners(){
        login.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();

            if(user.equals("")||pass.equals("")){
                Toast.makeText(loginPage.this, "Please enter all the field!", Toast.LENGTH_SHORT).show();
            }else{
                Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                if(checkuserpass==true){
                    Toast.makeText(loginPage.this, "Login successfully.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(loginPage.this,homeActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(loginPage.this, "Invalid credentials.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgotpassword.setOnClickListener(view -> {
            Intent intent = new Intent(loginPage.this,aboutUs.class);
            startActivity(intent);
        });
        signup.setOnClickListener(view -> {
            Intent intent = new Intent(loginPage.this,signUp.class);
            startActivity(intent);
        });
    }
}