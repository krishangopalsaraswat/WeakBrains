package com.example.abhi.weakbrain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExampaperoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exampaperone);
    }

    public void datastructure(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1oxdEMJtJKyL1QR_8O0jwvLBTEDyjpSOK"));
        startActivity(i);
    }

    public void mathsthree(View view) {
        Intent j=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1XVpj7q_iaF6wpxstzMbxAwJGAluUX0AY"));
        startActivity(j);

    }

    public void naca(View view) {
        Intent k=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1bXTTISCBkBtrJAYSYcPFPejbNXL9Ke7m"));
        startActivity(k);


    }

    public void datacommunication(View view) {
        Intent l=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1hZI0beThfRNIpF2VPFZa5IjFG8plKLM1"));
        startActivity(l);

    }

    public void oops(View view) {
        Intent m=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=17CucXlZoROyUMGPYQx3FZUq0RMzM3aG7"));
        startActivity(m);

    }
}
