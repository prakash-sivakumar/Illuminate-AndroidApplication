package com.example.illuminate;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Que_Generate extends Activity {

	TextView t1,t2,t3,t4,t5;
	public  static int count=1;
	public static ArrayList<String[]> questions;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_que__generate);
		
		t1=(TextView) findViewById(R.id.textView2);
		t2=(TextView) findViewById(R.id.textView3);
		t3=(TextView) findViewById(R.id.textView4);
		t4=(TextView) findViewById(R.id.textView5);
		t5=(TextView) findViewById(R.id.textView6);
		
		b1 = (Button) findViewById(R.id.button1);
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all = questions_fp.qcnt;
		t1.setText("GRE : " + all.get(0));
		t2.setText("CAT : " + all.get(1));
		t3.setText("CA : " + all.get(2));
		t4.setText("APTITUDE : " + all.get(3));
		t5.setText("TECH : " + all.get(4));
		questions = new ArrayList<String[]>();
		try{
		String str="";
		int i=1;
		 InputStream is = getResources().openRawResource(R.raw.datafile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	    	List<String> lsgroup = new ArrayList<String>();
	    	if (is!=null) {							
	    		while ((str = reader.readLine()) != null) {	    			
	    	    String[] record = str.split("~");		
	    	    questions.add(record);
	    		}				
	    	}		
	    	is.close();	
	    	Log.i("Q Arr", questions.size()+"");
		}
		catch(Exception e)
		{
			Log.i("Ex", e.getMessage()+"");
		}
		
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				if(count==1) {
					Toast.makeText(Que_Generate.this, "Enter your answer for all questions ", Toast.LENGTH_LONG).show();
					count++;
				}

				if(count==2)
				{
					startActivity(new Intent(getApplicationContext(),View_Question.class));
				}
			}
		});


		
		
	}
	@Override
	public void onBackPressed() {
	    // do nothing.
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.que__generate, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
