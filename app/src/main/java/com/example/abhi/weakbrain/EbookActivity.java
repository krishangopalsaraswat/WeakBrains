package com.example.abhi.weakbrain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EbookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook);
    }

    public void networks(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1XCDyssgSS5jfX42mbEZgyct1DCpTXzK9"));
        startActivity(i);
    }

    public void structure(View view) {
        Intent j=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1X0uVF4uDtfoKrU8BQDUs1XPCZj11jNxO"));
        startActivity(j);

    }

    public void java(View view) {
        Intent k=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Ntpvzvayf9WnqXNYiQhJDp1SdeQ9Rkjl"));
        startActivity(k);
    }
}
