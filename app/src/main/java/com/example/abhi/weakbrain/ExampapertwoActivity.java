package com.example.abhi.weakbrain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExampapertwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exampapertwo);
    }

    public void dld(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1DJm_hVT-Uq_3oxMa8mAL6dCd6n_1TLSX"));
        startActivity(i);
    }

    public void economics(View view) {
        Intent j=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1poUfVfAJ6jo86h7KLT4BqKgodNUfHJ0y"));
        startActivity(j);

    }

    public void iis(View view) {
        Intent k=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1JD_9kY1N5KOnWmwAGXTjA80ONO_-in0U"));
        startActivity(k);

    }

    public void cn(View view) {
        Intent l=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dUKj53aKT72d2DkBtUdt2IlBvnd-Qjg0"));
        startActivity(l);


    }

    public void discrete(View view) {
        Intent m=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1i4BzeAqanpFzEZlYJKDex8trFursSjdx"));
        startActivity(m);

    }
}
