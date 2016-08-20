package com.example.screenorientationtest;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textView2.setText("This is Landscape Mode.");
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            textView2.setText("This is Portrait Mode.");
        }
    }
}
