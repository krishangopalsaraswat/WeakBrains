package com.example.abhi.weakbrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstpageActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage_acticity);
    }

    public void second(View view) {
        Intent i=new Intent(FirstpageActicity.this,SecondpageActivity.class);
        startActivity(i);
    }

    public void exampaper(View view) {
        Intent j=new Intent(FirstpageActicity.this,ExampaperActivity.class);
        startActivity(j);
    }
}
