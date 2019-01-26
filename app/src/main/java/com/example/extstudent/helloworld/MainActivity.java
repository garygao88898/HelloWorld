package com.example.extstudent.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.extstudent.helloworld.R.color.colorPrimary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.hello_world);
        text.setTextColor(getResources().getColor(colorPrimary));
    }
}
//do you even know wht time isdt i =hello whst time isnit