package com.example.ardberrylayouthome;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class layoutsignin extends AppCompatActivity implements View.OnClickListener{

    private EditText nameField;
    private EditText passwordField;
    private EditText phoneNoField;
    private EditText emailField;
    private Button signInButton;        //not required now
    private TextView haveAccountText;   //not required now
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutsignin);

        firebaseAuth = FirebaseAuth.getInstance();

        nameField = findViewById(R.id.nameloginfield);
        passwordField = findViewById(R.id.passwordfield);
        emailField = findViewById(R.id.emailfield);
        phoneNoField = findViewById(R.id.phonenofield);

        signInButton = findViewById(R.id.signinbutton);

        haveAccountText = findViewById(R.id.haveaccount);

        progressDialog = new ProgressDialog(this);

        if(firebaseAuth.getCurrentUser()!=null){
            Toast.makeText(this,"Already Logged IN... Welcome",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),Houses.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
        }
    }

    public void registerUser(){

        String name = nameField.getText().toString().trim();
        String password = passwordField.getText().toString().trim();
        String phone = phoneNoField.getText().toString().trim();
        String email = emailField.getText().toString().trim();

        if (TextUtils.isEmpty(name)){
            Toast.makeText(this, "Please enter your name" , Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter a password to continue" , Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter your E-mail" , Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(phone)){
            Toast.makeText(this, "Please enter your Phone number" , Toast.LENGTH_SHORT).show();
            return;
        }
       if (password.length()<6){
            Toast.makeText(this,"Please insure your password is atleast 6 digits long",Toast.LENGTH_LONG*2).show();
            return;
        }
        progressDialog.setMessage("Registering Your Account....");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(layoutsignin.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(layoutsignin.this,Houses.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
                }
                else {
                    Toast.makeText(layoutsignin.this,"Registration Failed,check your email", Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();
            }
        });
    }

    public void clickSignIn(View view){
        registerUser();
    }
    public void clickHaveAccount(View view){
        Intent intent = new Intent(layoutsignin.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }
    @Override
    public void onClick(View view) {

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
