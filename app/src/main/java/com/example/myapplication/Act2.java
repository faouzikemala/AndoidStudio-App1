package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        TextView res=(TextView)findViewById(R.id.textView);


        String r =
                getIntent().getStringExtra("n")+" "
                        +getIntent().getStringExtra("p");
        res.setText("Bonjour " + r);

    }
}