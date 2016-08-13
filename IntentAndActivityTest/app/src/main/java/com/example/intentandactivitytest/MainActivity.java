package com.example.intentandactivitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
This Example shows how to move one activity to another.
Need to add Activity Entry in AndroidManifext.xml
Don't add as Category = LAUNCHER otherwise we will have
2 icons for the Application both will launch different activity
rather than only main.
We have 3 different ways to move to Different Activity.
As shown below.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSecondActivity(View view) {

        switch (view.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, SecondActivity.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                // We can pass Static Package Name as String in 1st Argument.
                // But need to pass Class name with Full package in 2nd Argument.
                Intent intent2 = new Intent();
                intent2.setClassName(this.getBaseContext(), "com.example.intentandactivitytest.SecondActivity");
                startActivity(intent2);
                break;

            case R.id.button3:
                // Name of the Activity in the action tag in intent filter tag of
                // activity entry in AndroidManifest.xml
                Intent intent3 = new Intent("SecondActivityName");
                startActivity(intent3);
                break;

            default:
                break;
        }
    }
}
