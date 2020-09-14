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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailField;
    private EditText passwordField;
    private Button loginButton;
    private TextView dontHaveAccountText;
    private FirebaseAuth firebaseauth;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailField = findViewById(R.id.emailloginfield);
        passwordField = findViewById(R.id.passwordloginfield);

        loginButton = findViewById(R.id.loginbutton);

        dontHaveAccountText = findViewById(R.id.donthaveaccount);

        progressDialog = new ProgressDialog(this);

        firebaseauth = FirebaseAuth.getInstance();

        if (firebaseauth.getCurrentUser()!=null){
            Toast.makeText(this, "Already Logged IN... Welcome",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Houses.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
        }
    }
    public void signUp(View view){
        Intent intent = new Intent(LoginActivity.this, layoutsignin.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }
    public void login(){
        String email = emailField.getText().toString().trim();
        String password = passwordField.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(LoginActivity.this,"Enter Your Email Address",Toast.LENGTH_LONG).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(LoginActivity.this,"Enter Your Password",Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("Logging You IN...");
        progressDialog.show();

        firebaseauth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful())
                        {
                            Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),Houses.class);
                            startActivity(intent);
                            overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
                        }
                        else {
                            Toast.makeText(LoginActivity.this,"Email or Password is incorrect",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    public void forgotPassword(View view){
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }

    public void loginInside(View view){
        login();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}
