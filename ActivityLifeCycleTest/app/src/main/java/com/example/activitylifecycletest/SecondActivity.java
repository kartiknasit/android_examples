package com.example.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("ActivityLifeCycleTest", "SecondActivity:onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycleTest", "SecondActivity:onDestroy");
    }
}
