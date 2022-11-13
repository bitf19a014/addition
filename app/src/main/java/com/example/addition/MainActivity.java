package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1 ,b2 ;
    TextView t1;
    Integer r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.number1);
        b2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.result);
        int i1=Integer.parseInt(b1.getText().toString());
        int i2=Integer.parseInt(b2.getText().toString());
        int i = i1 +i2;
        String s = String.valueOf(i);
        t1.setText(s);
    }

}