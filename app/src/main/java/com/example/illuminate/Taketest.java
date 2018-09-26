package com.example.illuminate;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Taketest extends Activity {

	Button b1;

	RadioGroup r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15;
	RadioButton radioCallButton;

	public static  String Aptitude = "";
	public static   String Tech = "";
	public static  String CA ="";
	public static  String GRE = "";
	public static   String CAT = "";
	public  static String dummy;
	public  static ArrayList<String> techchoice;

//	public static String dummy="";
//	public static int count=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taketest);
		b1= (Button) findViewById(R.id.btnnext);

		r1 = (RadioGroup) findViewById(R.id.radioGroup1);
		r2 = (RadioGroup) findViewById(R.id.radioGroup2);
		r3 = (RadioGroup) findViewById(R.id.radioGroup3);
		r4 = (RadioGroup) findViewById(R.id.radioGroup4);
		r5 = (RadioGroup) findViewById(R.id.radioGroup5);
		r6 = (RadioGroup) findViewById(R.id.radioGroup6);
		r7 = (RadioGroup) findViewById(R.id.radioGroup7);
		r8 = (RadioGroup) findViewById(R.id.radioGroup8);
		r9 = (RadioGroup) findViewById(R.id.radioGroup9);
		r10 = (RadioGroup) findViewById(R.id.radioGroup10);
		r11 = (RadioGroup) findViewById(R.id.radioGroup11);
		r12 = (RadioGroup) findViewById(R.id.radioGroup12);
		r13 = (RadioGroup) findViewById(R.id.radioGroup13);
		r14 = (RadioGroup) findViewById(R.id.radioGroup14);
		r15 = (RadioGroup) findViewById(R.id.radioGroup15);



		b1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				Aptitude = "";
				Tech = "";
				CA = "";
				GRE = "";
				CAT = "";
				techchoice=new ArrayList<String>();

				int selectedId = r1.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy = radioCallButton.getText().toString().trim();
				techchoice.add(dummy);

				 selectedId = r11.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				Aptitude = radioCallButton.getText().toString().trim();
				//	count++;


				selectedId = r3.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				Tech += radioCallButton.getText().toString().trim() + ",";
				//	count++;

				selectedId = r4.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				Tech += radioCallButton.getText().toString().trim();
				//	count++;

				selectedId = r2.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CA += radioCallButton.getText().toString().trim() + ",";
				//count++;
				selectedId = r4.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CA += radioCallButton.getText().toString().trim() + ",";

				selectedId = r8.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CA += radioCallButton.getText().toString().trim()+ ",";
				//	count++;

				selectedId = r9.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CA += radioCallButton.getText().toString().trim();

				selectedId = r2.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				GRE += radioCallButton.getText().toString().trim() + ",";

				selectedId = r4.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				GRE += radioCallButton.getText().toString().trim() + ",";

				selectedId = r10.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				GRE += radioCallButton.getText().toString().trim();
				//count++;

				selectedId = r2.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CAT += radioCallButton.getText().toString().trim() + ",";

				selectedId = r4.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CAT += radioCallButton.getText().toString().trim() + ",";

				selectedId = r11.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CAT += radioCallButton.getText().toString().trim()+",";

				selectedId = r9.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				CAT += radioCallButton.getText().toString().trim();
/*				//dummy
				selectedId = r1.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r5.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r6.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r7.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r9.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r12.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r13.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r14.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;

				selectedId = r15.getCheckedRadioButtonId();
				radioCallButton = (RadioButton) findViewById(selectedId);
				dummy += radioCallButton.getText().toString().trim();
				count++;
*/

				startActivity(new Intent(getApplicationContext(), Analysis.class));


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
		getMenuInflater().inflate(R.menu.taketest, menu);
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
