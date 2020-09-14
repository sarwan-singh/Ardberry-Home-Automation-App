package com.example.ardberrylayouthome;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    private EditText emailField;
    private static final String TAG = "MainActivity";
    private FirebaseAuth firebaseauth;
    private ProgressDialog progressDialogPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        progressDialogPassword = new ProgressDialog(this);
        emailField = findViewById(R.id.emailresetpasswordfield);
        firebaseauth = FirebaseAuth.getInstance();
    }
    public void forgotPassword(View view){
        progressDialogPassword.setMessage("Please Wait");
        progressDialogPassword.show();
        String email = emailField.getText().toString().trim();
        if (TextUtils.isEmpty(email)){
            progressDialogPassword.dismiss();
            Toast.makeText(ForgotPassword.this,"Enter Your Email Address To Continue",Toast.LENGTH_LONG).show();
            return;
        }
        firebaseauth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            progressDialogPassword.dismiss();
                            Toast.makeText(getApplicationContext(),"Link has been sent to your mail.",Toast.LENGTH_LONG).show();
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Do something after 5s = 5000ms
                                    Intent intent = new Intent(ForgotPassword.this,LoginActivity.class);
                                    startActivity(intent);
                                    overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
                                }
                            }, 2000);


                        }
                        else{
                            progressDialogPassword.dismiss();
                            Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}
