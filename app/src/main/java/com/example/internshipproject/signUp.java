package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    EditText signupusername, signuppassword, reenterpassword;
    Button comfirm;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        findViews();
        setListeners();
    }
    private void findViews(){
        signupusername = (EditText) findViewById(R.id.signupusername);
        signuppassword = (EditText) findViewById(R.id.signuppassword);
        reenterpassword = (EditText) findViewById(R.id.reenterpassword);
        comfirm = (Button) findViewById(R.id.btncomfirm);
        DB = new DBHelper(this);
    }

    private void setListeners(){
        comfirm.setOnClickListener(view -> {
            String user = signupusername.getText().toString();
            String pass = signuppassword.getText().toString();
            String repass = reenterpassword.getText().toString();

            if(user.equals("")||pass.equals("")||repass.equals("")){
                Toast.makeText(signUp.this, "Please enter all the field!", Toast.LENGTH_SHORT).show();
            }else{
                if (pass.equals(repass)){
                    Boolean checkuser = DB.checkusername(user);
                    if(checkuser==false){
                        Boolean insert = DB.insertData(user, pass);
                        if (insert== true){
                            Toast.makeText(signUp.this, "Registration completed.", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(signUp.this,homeActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(signUp.this, "Registration failed.", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(signUp.this, "User already exists!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(signUp.this, "Passwords not matching.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}