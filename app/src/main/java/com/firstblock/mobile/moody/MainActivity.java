package com.firstblock.mobile.moody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.TextView;

import me.angrybyte.circularslider.CircularSlider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircularSlider circular = (CircularSlider) findViewById(R.id.circular);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        TextView textView2 = (TextView) findViewById(R.id.textView2);



    }



}
