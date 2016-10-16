package com.kartik.sampleapps.checkboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private CheckBox hello_cb, hi_cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello_cb = (CheckBox) findViewById(R.id.hello_cb);
        hi_cb = (CheckBox) findViewById(R.id.hi_cb);

        hello_cb.setOnCheckedChangeListener(this);
        hi_cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String message = "";
        switch (compoundButton.getId()) {
            case R.id.hello_cb:
                message = "Hello";
                break;
            case R.id.hi_cb:
                message = "Hi";
                break;
            default:
                break;
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
