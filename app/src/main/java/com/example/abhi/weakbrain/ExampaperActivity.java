package com.example.abhi.weakbrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class ExampaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exampaper);

    }

    public void one(View view) {
        Intent i=new Intent(ExampaperActivity.this,ExampaperoneActivity.class);
        startActivity(i);
    }

    public void two(View view) {
        Intent j=new Intent(ExampaperActivity.this,ExampapertwoActivity.class);
        startActivity(j);
    }
}
