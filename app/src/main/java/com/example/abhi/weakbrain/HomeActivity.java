package com.example.abhi.weakbrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void firstactivity(View view) {
        Intent i=new Intent(HomeActivity.this,FirstpageActicity.class);
        startActivity(i);
        finish();
    }
}
