package com.kartik.sampleapps.radiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup radioGroup1, radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);

        radioGroup1.setOnCheckedChangeListener(this);
        radioGroup2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        String message = "";
        switch(checkedId) {
            case R.id.excellent_rb:
                message = "Excellent";
                break;
            case R.id.good_rb:
                message = "Good";
                break;
            case R.id.average_rb:
                message = "Average";
                break;
            case R.id.apple_rb:
                message = "Apple";
                break;
            case R.id.samsung_rb:
                message = "Samsung";
                break;
            case R.id.lg_rb:
                message = "LG";
                break;
            case R.id.htc_rb:
                message = "HTC";
                break;
            default:
                break;
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
