package com.example.abhi.weakbrain;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    EditText etEmail,etPass;
    Button BtSignup;
    FirebaseAuth myFirebaseAuth;
    String myEmail,myPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFirebaseAuth=FirebaseAuth.getInstance();
       if(myFirebaseAuth.getCurrentUser() !=null)
        {
            Intent homeIntent=new Intent(MainActivity.this, HomeActivity.class);
            startActivity(homeIntent);
            finish();

        }
        etEmail=(EditText)findViewById(R.id.signupemail);
        etPass=(EditText)findViewById(R.id.signuppassword);
        BtSignup=(Button)findViewById(R.id.signupbutton);
        progressBar=(ProgressBar)findViewById(R.id.signupprogressbar);

        BtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myEmail=etEmail.getText().toString();
                myPassword=etPass.getText().toString();
                CreateNewUser();
            }
        });

    }
    private void CreateNewUser(){
        final String email=etEmail.getText().toString().trim();
        final String password=etPass.getText().toString().trim();
        if(email.isEmpty()){
            etEmail.setError("Email is required");
            etEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            etPass.setError("Password is required");
            return;
        }
        if(password.length()<6){
            etPass.setError("Minimum length of password should be 6");
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        myFirebaseAuth.signInWithEmailAndPassword(myEmail,myPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if(task.isSuccessful()){
                    Intent homeIntent=new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                    finish();
                }
                else {
                       Toast.makeText(MainActivity.this, "Account Not found", Toast.LENGTH_SHORT).show();
                    }
                }


        });

    }


    public void SignUp(View view) {
        Intent i=new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(i);
    }
}
