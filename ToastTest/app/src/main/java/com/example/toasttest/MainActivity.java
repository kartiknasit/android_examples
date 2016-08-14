package com.example.toasttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/*
This example shows how to display User Message named Toast.
We can display every position in the screen.
Some most basic positions are TOP,LEFT,CENTER,BOTTOM.
Position in Screen Called Gravity for particular Component.
Now We can also display our Custom Toast.
As shown in the below code we need to have one Layout File for this Custom Toast.
Using Layout Inflater we can show our Custom Toast.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {

        Toast toast;
        String text = null;
        int gravity = 0;
        int x = 0;
        int y = 0;

        switch (view.getId()) {
            case R.id.bt_bottom:
                text = "Bottom Toast";
                gravity = Gravity.BOTTOM;
                break;
            case R.id.bt_bottom_left:
                text = "Bottom Left Toast";
                gravity = Gravity.BOTTOM | Gravity.LEFT;
                break;
            case R.id.bt_bottom_right:
                text = "Bottom Right Toast";
                gravity = Gravity.BOTTOM | Gravity.RIGHT;
                break;
            case R.id.bt_top:
                text = "Top Toast";
                gravity = Gravity.TOP;
                break;
            case R.id.bt_top_left:
                text = "Top Left Toast";
                gravity = Gravity.TOP | Gravity.LEFT;
                break;
            case R.id.bt_top_right:
                text = "Top Right Toast";
                gravity = Gravity.TOP | Gravity.LEFT;
                break;
            case R.id.bt_left:
                text = "Left Toast";
                gravity = Gravity.LEFT;
                break;
            case R.id.bt_right:
                text = "Right Toast";
                gravity = Gravity.RIGHT;
                break;
            case R.id.bt_center:
                text = "Center Toast";
                gravity = Gravity.CENTER;
                break;
            case R.id.bt_center_100_200:
                text = "Center Toast 100,200";
                gravity = Gravity.CENTER;
                x = 100;
                y = 200;
                break;
            case R.id.bt_center_100__200:
                text = "Center Toast 100,-200";
                gravity = Gravity.CENTER;
                x = 100;
                y = -200;
                break;
            case R.id.bt_custom_toast:
                LayoutInflater inflater = getLayoutInflater();
                View custom_toast_view =
                        inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.custom_toast_id));
                Toast custom_toast = new Toast(this);
                custom_toast.setView(custom_toast_view);
                custom_toast.setGravity(Gravity.CENTER, 0, 0);
                custom_toast.show();
                break;
            default:
                break;
        }
        if(view.getId() != R.id.bt_custom_toast) {
            toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
            toast.setGravity(gravity, x, y);
            toast.show();
        }
    }
}
