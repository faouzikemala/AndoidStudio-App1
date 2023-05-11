package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText t1 =(EditText) findViewById(R.id.txt1);
        EditText t2=(EditText) findViewById(R.id.txt2);
        Button b1=(Button) findViewById(R.id.btn);
        Button b2=(Button) findViewById(R.id.btn2);


        /* Explicite */
        b1.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View btn) {
                        Intent i = new Intent(MainActivity.this, Act2.class);
                        i.putExtra("n", t1.getText().toString());
                        i.putExtra("p", t2.getText().toString());
                        startActivity(i);
                    } });





        /* Implicite */
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent i=new Intent(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);
            };
        });







    }
}