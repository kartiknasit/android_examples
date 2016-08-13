package com.example.buttonclicktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
There are 3 ways we can use Button Click event.
1.) By Implementing OnClickListener Interface from View.
    In this case we need to implement onClick Method of the Interface.
2.) By creating Anonymous class of OnClickListener.
3.) By providing method in the activity_main.xml.
    Means any layout xml which is representing certain Activity Class.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_interface_method1, bt_anonymous;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_interface_method1 = (Button) findViewById(R.id.bt_interface_method1);
        bt_anonymous = (Button) findViewById(R.id.bt_anonymous);
        textView = (TextView) findViewById(R.id.textView);

        // Set Listener for this Button
        // We provided this for below as our class implements OnClickListener
        // We can provide any class which is implementing OnClickListener
        // For This Button to handle Event when Clicked on that
        bt_interface_method1.setOnClickListener(this);

        // Similarly we can provide button own method and listener
        // Below we created Anonymous class which listens buttons Click Event
        // When clicked it will call onClick method inside of that anonymous class
        bt_anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Anonymous Button Clicked.");
            }
        });
    }

    // Now if we have multiple buttons registered to same class
    // then we can differentiate by their ids
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bt_interface_method1) {
            textView.setText("1st Interface Method Button Clicked.");
        }
        else if(view.getId() == R.id.bt_interface_method2) {
            textView.setText("2nd Interface Method Button Clicked.");
        }
    }

    // Also if we have multiple buttons in Layout XML
    // Which contains same Click Method then we can differentiate
    // By their by ids as below
    public void onClickForXMLButton(View view) {
        if(view.getId() == R.id.bt_xml1) {
            textView.setText("1st XML Button Called.");
        }
        else if(view.getId() == R.id.bt_xml2) {
            textView.setText("2nd XML Button Called.");
        }
    }
}
