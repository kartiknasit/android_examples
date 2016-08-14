package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
        Log.d("ActivityLifeCycleTest", "MainActivity:onCreate");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycleTest", "MainActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycleTest", "MainActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycleTest", "MainActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycleTest", "MainActivity:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycleTest", "MainActivity:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycleTest", "MainActivity:onDestroy");
    }
}
