package com.example.illuminate;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aravind Sankar on 02-04-2016.
 */
public class Reference extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);

        Button b1,b2,b3,b4;
        b1= (Button) findViewById(R.id.button4);
        b2= (Button) findViewById(R.id.button5);
        b3= (Button) findViewById(R.id.button6);
        b4=(Button) findViewById(R.id.button7);


        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Masters.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Management.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Govt.class));


            }

        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Resource.class));


            }

        });
    }

}
