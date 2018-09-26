package com.example.illuminate;


import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Activity {

	TextView t1,t2;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		t1= (TextView) findViewById(R.id.textView3);
		t2= (TextView) findViewById(R.id.textView4);
		int a,a1;
		a=(int)((View_Question.res1)*100);
		a1=(int)((View_Question.res2)*100);
		t1.setText("Clearing an Interview  :  " + a+ " % ");
		t2.setText("Clearing competitive exams  :  " + a1 + " % ");
	/*	t1.setText(" "+View_Question.sum + View_Question.total +    View_Question.res1);
		t2.setText(" " + View_Question.sum1 +  View_Question.total1 +   View_Question.res2 );*/
		b1 = (Button) findViewById(R.id.button8);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
			public void onClick(View v) {

				//startActivity(new Intent(getApplicationContext(),MainActivity.class));
				finishAffinity();
				System.exit(0);


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
		getMenuInflater().inflate(R.menu.result, menu);
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
