package com.example.abhi.weakbrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
    }

    public void previousone(View view) {
        Intent i=new Intent(SecondpageActivity.this,FirstpageActicity.class);
        startActivity(i);
    }

    public void nextone(View view) {
        Intent j=new Intent(SecondpageActivity.this,ThirdpageActivity.class);
        startActivity(j);
    }

    public void ebook(View view) {
        Intent k=new Intent(SecondpageActivity.this,EbookActivity.class);
        startActivity(k);
    }
}
