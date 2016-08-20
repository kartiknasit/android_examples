package com.example.screenorientationtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ScreenOrientationTest", "SecondActivity:onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ScreenOrientationTest", "SecondActivity:onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ScreenOrientationTest", "SecondActivity:onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ScreenOrientationTest", "SecondActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ScreenOrientationTest", "SecondActivity:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ScreenOrientationTest", "SecondActivity:onDestroy");
    }
}
