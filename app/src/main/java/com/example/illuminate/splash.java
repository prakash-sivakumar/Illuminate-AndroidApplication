package com.example.illuminate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Aravind Sankar on 22-03-2016.
 */
public class splash extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer=new Thread()
        {
            public void run(){
                try{
                    sleep(5000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }


        };
        timer.start();
    }
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
