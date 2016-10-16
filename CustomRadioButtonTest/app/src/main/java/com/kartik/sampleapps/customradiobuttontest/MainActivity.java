package com.kartik.sampleapps.customradiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    RadioButton excellent_rb, good_rb, dont_ask_rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        excellent_rb = (RadioButton) findViewById(R.id.excellent_rb);
        good_rb = (RadioButton) findViewById(R.id.good_rb);
        dont_ask_rb = (RadioButton) findViewById(R.id.dont_ask_rb);

        excellent_rb.setOnCheckedChangeListener(this);
        good_rb.setOnCheckedChangeListener(this);
        dont_ask_rb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String message = "";
        switch (compoundButton.getId()) {
            case R.id.excellent_rb:
                if(b) {
                    message = "Excellent";
                    good_rb.setChecked(false);
                    dont_ask_rb.setChecked(false);
                }
                break;
            case R.id.good_rb:
                if(b) {
                    message = "Good";
                    excellent_rb.setChecked(false);
                    dont_ask_rb.setChecked(false);
                }
                break;
            case R.id.dont_ask_rb:
                if(b) {
                    message = "Don't Ask";
                    excellent_rb.setChecked(false);
                    good_rb.setChecked(false);
                }
                break;
            default:
                break;
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
