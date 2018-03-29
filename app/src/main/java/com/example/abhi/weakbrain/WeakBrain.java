package com.example.abhi.weakbrain;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.firebase.client.Firebase;

/**
 * Created by abhi on 28/3/18.
 */

public class WeakBrain extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
