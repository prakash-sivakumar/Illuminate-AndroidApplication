package com.example.illuminate;


import java.util.ArrayList;

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

public class Analysis extends Activity {


	TextView t1,t2,t3,t4,t5;
	Button b1;
	public static ArrayList arr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_analysis);

		t1=(TextView) findViewById(R.id.ranques);
		t2=(TextView) findViewById(R.id.textView2);
		t3=(TextView) findViewById(R.id.textView3);
		t4=(TextView) findViewById(R.id.textView4);
		t5=(TextView) findViewById(R.id.textView5);


		b1 =(Button) findViewById(R.id.btnnext);



		t1.setText("GRE : " + Taketest.GRE);
		t2.setText("CAT : " + Taketest.CAT);
		t3.setText("CA : " + Taketest.CA);
		t4.setText("Aptitude : " + Taketest.Aptitude);
		t5.setText("Tech : " + Taketest.Tech);

		String techres = "";
		if(Taketest.Tech.equals("mediocre,IT sector."))
			techres = "moderate";
		else if(Taketest.Tech.equals("moderate,IT sector."))
			techres = "good";
		else if(Taketest.Tech.equals("good,IT sector."))
			techres = "good";
		else if(Taketest.Tech.equals("excellent,IT sector."))
			techres = "excellent";
		else if(Taketest.Tech.equals("mediocre,Govt sector."))
			techres = "mediocre";
		else if(Taketest.Tech.equals("moderate,Govt sector."))
			techres = "mediocre";
		else if(Taketest.Tech.equals("good,Govt sector."))
			techres = "moderate";
		else if(Taketest.Tech.equals("excellent,Govt sector."))
			techres = "good";
		else
			techres = "good";

		t5.setText("Tech : " + techres);


		String cares = "";
		if(Taketest.CA.equals("No way,Govt sector.,No,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("No way,Govt sector.,may be not.,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("No way,Govt sector.,may be,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("No way,Govt sector.,yes,mediocre"))
			cares ="moderate";
			//
		else if(Taketest.CA.equals("No way,Govt sector.,No,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,may be not.,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,may be,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,yes,moderate"))
			cares ="good";
			//
		else if(Taketest.CA.equals("No way,Govt sector.,No,good"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,may be not.,good"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,may be,good"))
			cares ="good";
		else if(Taketest.CA.equals("No way,Govt sector.,yes,good"))
			cares ="good";
			//
		else if(Taketest.CA.equals("No way,Govt sector.,No,excellent"))
			cares ="moderate";
		else if(Taketest.CA.equals("No way,Govt sector.,may be not.,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("No way,Govt sector.,may be,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("No way,Govt sector.,yes,excellent"))
			cares ="excellent";
			//meager
		else if(Taketest.CA.equals("chances are meager,Govt sector.,No,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be not.,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be,mediocre"))
			cares ="moderate";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,yes,mediocre"))
			cares ="moderate";
			//
		else if(Taketest.CA.equals("chances are meager,Govt sector.,No,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be not.,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be,moderate"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,yes,moderate"))
			cares ="good";
			//
		else if(Taketest.CA.equals("chances are meager,Govt sector.,No,good"))
			cares ="moderate";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be not.,good"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be,good"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,yes,good"))
			cares ="good";
			//
		else if(Taketest.CA.equals("chances are meager,Govt sector.,No,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be not.,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,may be,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("chances are meager,Govt sector.,yes,excellent"))
			cares ="excellent";
			//some extent
		else if(Taketest.CA.equals("To some extent,Govt sector.,No,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be not.,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be,mediocre"))
			cares ="moderate";
		else if(Taketest.CA.equals("To some extent,Govt sector.,yes,mediocre"))
			cares ="moderate";
			//
		else if(Taketest.CA.equals("To some extent,Govt sector.,No,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be not.,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be,moderate"))
			cares ="good";
		else if(Taketest.CA.equals("To some extent,Govt sector.,yes,moderate"))
			cares ="good";
			//
		else if(Taketest.CA.equals("To some extent,Govt sector.,No,good"))
			cares ="moderate";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be not.,good"))
			cares ="good";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be,good"))
			cares ="good";
		else if(Taketest.CA.equals("To some extent,Govt sector.,yes,good"))
			cares ="excellent";
			//
		else if(Taketest.CA.equals("To some extent,Govt sector.,No,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be not.,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("To some extent,Govt sector.,may be,excellent"))
			cares ="excellent";
		else if(Taketest.CA.equals("To some extent,Govt sector.,yes,excellent"))
			cares ="excellent";
			//very much
		else if(Taketest.CA.equals("Very much interested,Govt sector.,No,mediocre"))
			cares ="mediocre";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be not.,mediocre"))
			cares ="moderate";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be,mediocre"))
			cares ="moderate";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,yes,mediocre"))
			cares ="good";
			//
		else if(Taketest.CA.equals("Very much interested,Govt sector.,No,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be not.,moderate"))
			cares ="moderate";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be,moderate"))
			cares ="good";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,yes,moderate"))
			cares ="good";
			//
		else if(Taketest.CA.equals("Very much interested,Govt sector.,No,good"))
			cares ="good";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be not.,good"))
			cares ="good";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be,good"))
			cares ="good";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,yes,good"))
			cares ="excellent";
			//
		else if(Taketest.CA.equals("Very much interested,Govt sector.,No,excellent"))
			cares ="good";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be not.,excellent"))
			cares ="excellent";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,may be,excellent"))
			cares ="excellent";
		else if(Taketest.CA.equals("Very much interested,Govt sector.,yes,excellent"))
			cares ="excellent";

		else if((Taketest.CA.contains("IT sector.") || Taketest.CA.contains("Core sector")) && Taketest.CA.contains("No") )
			cares ="mediocre";
		else if((Taketest.CA.contains("IT sector.") || Taketest.CA.contains("Core sector")) && Taketest.CA.contains("may be not.") )
			cares ="mediocre";
		else if((Taketest.CA.contains("IT sector.") || Taketest.CA.contains("Core sector")) && Taketest.CA.contains("may be") )
			cares ="moderate";
		else if((Taketest.CA.contains("IT sector.") || Taketest.CA.contains("Core sector")) && Taketest.CA.contains("yes") )
			cares ="moderate";
		else
			cares = "good";

		t3.setText("CA : " + cares);

		String grees = "";
		if(Taketest.GRE.equals("No way,IT sector.,mediocre"))
			grees ="mediocre";
		else if(Taketest.GRE.equals("No way,IT sector.,moderate"))
			grees ="moderate";
		else if(Taketest.GRE.equals("No way,IT sector.,good"))
			grees ="good";
		else if(Taketest.GRE.equals("No way,IT sector.,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("chances are meager,IT sector.,mediocre"))
			grees ="moderate";
		else if(Taketest.GRE.equals("chances are meager,IT sector.,moderate"))
			grees ="good";
		else if(Taketest.GRE.equals("chances are meager,IT sector.,good"))
			grees ="good";
		else if(Taketest.GRE.equals("chances are meager,IT sector.,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("To some extent,IT sector.,mediocre"))
			grees ="good";
		else if(Taketest.GRE.equals("To some extent,IT sector.,moderate"))
			grees ="good";
		else if(Taketest.GRE.equals("To some extent,IT sector.,good"))
			grees ="excellent";
		else if(Taketest.GRE.equals("To some extent,IT sector.,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("Very much interested,IT sector.,mediocre"))
			grees ="good";
		else if(Taketest.GRE.equals("Very much interested,IT sector.,moderate"))
			grees ="excellent";
		else if(Taketest.GRE.equals("Very much interested,IT sector.,good"))
			grees ="excellent";
		else if(Taketest.GRE.equals("Very much interested,IT sector.,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("mediocre") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("moderate") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("good") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("excellent") )
			grees ="moderate";
			//
		else if(Taketest.GRE.equals("No way,Core sector,mediocre"))
			grees ="mediocre";
		else if(Taketest.GRE.equals("No way,Core sector,moderate"))
			grees ="moderate";
		else if(Taketest.GRE.equals("No way,Core sector,good"))
			grees ="good";
		else if(Taketest.GRE.equals("No way,Core sector,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("chances are meager,Core sector,mediocre"))
			grees ="moderate";
		else if(Taketest.GRE.equals("chances are meager,Core sector,moderate"))
			grees ="good";
		else if(Taketest.GRE.equals("chances are meager,Core sector,good"))
			grees ="good";
		else if(Taketest.GRE.equals("chances are meager,Core sector,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("To some extent,Core sector,mediocre"))
			grees ="good";
		else if(Taketest.GRE.equals("To some extent,Core sector,moderate"))
			grees ="good";
		else if(Taketest.GRE.equals("To some extent,Core sector,good"))
			grees ="excellent";
		else if(Taketest.GRE.equals("To some extent,Core sector,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.equals("Very much interested,Core sector,mediocre"))
			grees ="good";
		else if(Taketest.GRE.equals("Very much interested,Core sector,moderate"))
			grees ="excellent";
		else if(Taketest.GRE.equals("Very much interested,Core sector,good"))
			grees ="excellent";
		else if(Taketest.GRE.equals("Very much interested,Core sector,excellent"))
			grees ="excellent";

		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("mediocre") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("moderate") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("good") )
			grees ="mediocre";
		else if(Taketest.GRE.contains("Govt sector.") && Taketest.GRE.contains("excellent") )
			grees ="moderate";
		else
			grees="good";
		//Cat
		String cat = "";
		if(Taketest.CAT.equals("No way,IT sector.,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,IT sector.,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,IT sector.,good,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,IT sector.,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("No way,IT sector.,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,good,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("No way,IT sector.,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,moderate,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,IT sector.,excellent,good"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("No way,IT sector.,mediocre,excellent"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,IT sector.,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,IT sector.,good,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,IT sector.,excellent,excellent"))
			cat ="excellent";
			//meager
		else if(Taketest.CAT.equals("chances are meager,IT sector.,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("chances are meager,IT sector.,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("chances are meager,IT sector.,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,moderate,good"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,excellent,good"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("chances are meager,IT sector.,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,good,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,IT sector.,excellent,excellent"))
			cat ="excellent";
			//extent
		else if(Taketest.CAT.equals("To some extent,IT sector.,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("To some extent,IT sector.,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("To some extent,IT sector.,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,IT sector.,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("To some extent,IT sector.,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,IT sector.,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,IT sector.,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,IT sector.,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("To some extent,IT sector.,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,IT sector.,moderate,good"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,IT sector.,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,IT sector.,excellent,good"))
			cat ="excellent";
			//
		else if(Taketest.CAT.equals("To some extent,IT sector.,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,IT sector.,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,IT sector.,good,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("To some extent,IT sector.,excellent,excellent"))
			cat ="excellent";
			//very much
		else if(Taketest.CAT.equals("Very much interested,IT sector.,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,excellent,mediocre"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("Very much interested,IT sector.,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("Very much interested,IT sector.,mediocre,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,moderate,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,excellent,good"))
			cat ="excellent";
			//
		else if(Taketest.CAT.equals("Very much interested,IT sector.,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,moderate,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,good,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("Very much interested,IT sector.,excellent,excellent"))
			cat ="excellent";

		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("mediocre") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("moderate") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("good") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("excellent") )
			cat ="moderate";
			//for core sector
		else if(Taketest.CAT.equals("No way,Core sector,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,Core sector,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,Core sector,good,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("No way,Core sector,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("No way,Core sector,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,good,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("No way,Core sector,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,moderate,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,Core sector,excellent,good"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("No way,Core sector,mediocre,excellent"))
			cat ="moderate";
		else if(Taketest.CAT.equals("No way,Core sector,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,Core sector,good,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("No way,Core sector,excellent,excellent"))
			cat ="excellent";
			//meager
		else if(Taketest.CAT.equals("chances are meager,Core sector,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("chances are meager,Core sector,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("chances are meager,Core sector,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,Core sector,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("chances are meager,Core sector,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,Core sector,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,Core sector,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,Core sector,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("chances are meager,Core sector,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,Core sector,moderate,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("chances are meager,Core sector,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,Core sector,excellent,good"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("chances are meager,Core sector,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,Core sector,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,Core sector,good,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("chances are meager,Core sector,excellent,excellent"))
			cat ="excellent";
			//extent
		else if(Taketest.CAT.equals("To some extent,Core sector,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("To some extent,Core sector,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("To some extent,Core sector,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,Core sector,excellent,mediocre"))
			cat ="moderate";
			//
		else if(Taketest.CAT.equals("To some extent,Core sector,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,Core sector,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,Core sector,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,Core sector,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("To some extent,Core sector,mediocre,good"))
			cat ="moderate";
		else if(Taketest.CAT.equals("To some extent,Core sector,moderate,good"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,Core sector,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,Core sector,excellent,good"))
			cat ="excellent";
			//
		else if(Taketest.CAT.equals("To some extent,Core sector,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,Core sector,moderate,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("To some extent,Core sector,good,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("To some extent,Core sector,excellent,excellent"))
			cat ="excellent";
			//very much
		else if(Taketest.CAT.equals("Very much interested,Core sector,mediocre,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("Very much interested,Core sector,moderate,mediocre"))
			cat ="mediocre";
		else if(Taketest.CAT.equals("Very much interested,Core sector,good,mediocre"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,Core sector,excellent,mediocre"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("Very much interested,Core sector,mediocre,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,Core sector,moderate,moderate"))
			cat ="moderate";
		else if(Taketest.CAT.equals("Very much interested,Core sector,good,moderate"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,Core sector,excellent,moderate"))
			cat ="good";
			//
		else if(Taketest.CAT.equals("Very much interested,Core sector,mediocre,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,Core sector,moderate,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,Core sector,good,good"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,Core sector,excellent,good"))
			cat ="excellent";
			//
		else if(Taketest.CAT.equals("Very much interested,Core sector,mediocre,excellent"))
			cat ="good";
		else if(Taketest.CAT.equals("Very much interested,Core sector,moderate,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("Very much interested,Core sector,good,excellent"))
			cat ="excellent";
		else if(Taketest.CAT.equals("Very much interested,Core sector,excellent,excellent"))
			cat ="excellent";


		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("mediocre") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("moderate") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("good") )
			cat ="mediocre";
		else if(Taketest.CAT.contains("Govt sector.") && Taketest.GRE.contains("excellent") )
			cat ="moderate";
		else
			cat="good";

		t1.setText("GRE : " + grees);
		t2.setText("CAT : " + cat);


		arr = new ArrayList();
		arr.add(grees);
		arr.add(cat);
		arr.add(cares);
		arr.add(Taketest.Aptitude);
		arr.add(techres);


		questions_fp ob = new questions_fp();
		ob.generatequestion(arr);

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(getApplicationContext(),Que_Generate.class));
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
		getMenuInflater().inflate(R.menu.analysis, menu);
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
