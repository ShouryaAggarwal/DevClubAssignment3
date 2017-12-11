package com.shouryaaggarwal.hp.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button incbutton, resetbutton, decbutton;
    TextView countdisplay;

    int cntr=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decbutton = findViewById(R.id.decButton);
        resetbutton = findViewById(R.id.resetButton);
        incbutton = findViewById(R.id.incButton);
        countdisplay = findViewById(R.id.currentcount);
    }

    public void displayCount(int cnt)
    {
        countdisplay.setText(Integer.toString(cnt));
    }


    public void decreaseCount(View view) {
        cntr--;
        displayCount(cntr);
    }

    public void incCount(View view) {
        cntr++;
        displayCount(cntr);
    }

    public void resetCount(View view) {
        cntr=0;
        displayCount(cntr);
    }
}