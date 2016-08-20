package com.example.screenorientationtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
    This example shows how can we lock screen orientation
    or intercept when android does the screen orientation
    1.) You can check in this example that if we only define any of orientation
        Just like we have added for MainActivity in AndroidManifest File.
        MainActivity does not reflect to Landscape mode and it's
        Orientation remains only in portrait mode.
    2.) Now whenever Orientation changed and we then changed it to Portrait
        Activity Life Cycle called as per below sequence.
        1.)OnPause --> 2.) OnStop --> 3.) OnDestroy --> 4.) OnStart --> 5.) OnResume
        Now if we want to change anything when Orientation changed without
    3.) Overriding Life Cycle methods then we can change that by overridding
        onConfigurationChanged method(See ThirdActivity).
        For that we need to also add one property in Manifest File.
        android:configChanges="orientation|screenSize|keyboardHidden".

 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
