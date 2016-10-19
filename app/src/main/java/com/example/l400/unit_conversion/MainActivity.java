package com.example.l400.unit_conversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void speedconversion(View view) {
        Intent inte = new  Intent(MainActivity.this,Conversion_Of_Speed.class);
        startActivity(inte);
    }

    public void distanceconversion(View view) {
        Intent inte = new  Intent(MainActivity.this,Conversion_Of_Distance.class);
        startActivity(inte);
    }

    public void weightconversion(View view) {
        Intent inte = new  Intent(MainActivity.this,Conversion_Of_Weight.class);
        startActivity(inte);
    }

    public void temperatureconversion(View view) {
        Intent inte = new  Intent(MainActivity.this,Conversion_Of_Temperature.class);
        startActivity(inte);
    }
}
