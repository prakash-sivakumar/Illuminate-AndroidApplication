package com.example.illuminate;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class View_Question extends Activity {

	
	
	int co_gre;
	int co_cat;
	int co_ca;
	int  co_aptitude;
	int  co_technical;	
	String type[]={"mediocre","moderate","good","excellent"};
	String topic[]={"GRE","CAT","CA","Aptitude","Tech"};
	String ans[]=new String[5];
	public static int t1=1,t2=1,t3=1,t4=1;
	public static String tem,tem1,temp,temp1,temp2,temp3,temp4,userans;
	public static double sum,sum1,total,total1;
	public static String ab=Taketest.dummy;

	public static String abc[]=new String[]{"School of EEE","School of Computing","School of Chemical and BioTech","School of mechanical Engg","School of CIVIL"};
//	System.out.println("Enter no of questions for gre,cat,ca,aptitude,technical in this order");

	String techchoi="";
	String medi[]=new String[]{"mediocre","mediocre","moderate","moderate","good"};
	String moder[]=new String[]{"moderate","mediocre","moderate","good","good"};
	String good[]=new String[]{"good","moderate","good","good","excellent"};
	String exe[]=new String[]{"excellent","moderate","good","good","excellent"};
	double a1[]=new double[]{0.0,0.24};
	double a2[]=new double[]{0.25,0.49};
	double a3[]=new double[]{0.50,0.74};
	double a4[]=new double[]{0.75,0.100};
	
	
	double noofmarksgre=0;
	double collectedmarkgre=0;
	double noofmarkscat=0;
	double collectedmarkcat=0;
	double noofmarksca=0;
	double collectedmarkca=0;
	double noofmarksaptitude=0;
	double collectedmarkaptitude=0;
	double noofmarkstech=0;
	double collectedmarktech=0;
	double count_que=0;
	int count_cans=0;
	int count_cor_gre=0;
	int count_cor_cat=0;
	int count_cor_ca=0;
	int count_cor_aptitude=0;
	int count_cor_technical=0;
	
	 RadioGroup radioGroup;
	 RadioButton radioButton;
	 Button btnDisplay;
	 TextView question;

	RadioButton r1,r2,r3,r4,r5;
	int in_gre=1,in_cat=1,in_ca=1,in_ap=1,in_tech=1;
	public static String Answers = "";
	
	public static double res1=0.0,res2=0.0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view__question);
		
		
		question = (TextView) findViewById(R.id.ranques);
		r1 = (RadioButton) findViewById(R.id.opt1);
		r2 = (RadioButton) findViewById(R.id.opt2);
		r3 = (RadioButton) findViewById(R.id.opt3);
		r4 = (RadioButton) findViewById(R.id.opt4);
		r5 = (RadioButton) findViewById(R.id.opt5);
		
		r5.setVisibility(View.INVISIBLE);

		radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		btnDisplay = (Button) findViewById(R.id.btnnext);
		if(ab.equals("School of EEE")) {
			techchoi="tech_EEE";
		}
		if(ab.equals("School of Computing")) {
			techchoi="tech";
		}
		if(ab.equals("School of Chemical and BioTech")) {
			techchoi="tech_C";
		}
		if(ab.equals("School of mechanical Engg")) {
			techchoi="tech_mech";
		}
		if(ab.equals("School of CIVIL")) {
			techchoi="tech_CI";
		}




		for(int i=0;i<Analysis.arr.size();i++)
		{
		Log.i("Your answer for :",Analysis.arr.get(i).toString());
		ans[i]=Analysis.arr.get(i).toString();
		}
		ArrayList<Integer> all = new ArrayList<Integer>();
		all = questions_fp.qcnt;
		co_gre= all.get(0);
		co_cat=all.get(1);
		co_ca=all.get(2);
		co_aptitude=all.get(3);
		co_technical=all.get(4);
		temp=ans[0];

		temp1 = Analysis.arr.get(1).toString();
		temp2 = Analysis.arr.get(2).toString();
		temp3 = Analysis.arr.get(3).toString();
		temp4 = Analysis.arr.get(4).toString();
		System.out.println(temp1+temp2+temp3+temp4);
		
		
		String[] ques = CreateQuestion("GRE");
		question.setText(ques[1].trim());
		r1.setText(ques[2].trim());
		r2.setText(ques[3].trim());
		r3.setText(ques[4].trim());
		r4.setText(ques[5].trim());
		Answers = ques[6].trim();
		
		btnDisplay.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {

				int selectedId = radioGroup.getCheckedRadioButtonId();
		         radioButton = (RadioButton) findViewById(selectedId);

//System.out.println(ab);

		         if(in_gre <=co_gre)
		         {

					 userans = radioButton.getText().toString();
		         if(Answers.equals(userans))
		        	 CheckGRE("correct");
		         else
		        	 CheckGRE("incorrect");
		         
		         String[] ques = CreateQuestion("GRE");
		 		 question.setText(ques[1].trim());
		 		 r1.setText(ques[2].trim());
		 		 r2.setText(ques[3].trim());
		 		 r3.setText(ques[4].trim());
		 		 r4.setText(ques[5].trim());
		 		 Answers = ques[6].trim();
		         
		 	    r1.setChecked(false);
			    r2.setChecked(false);
			    r3.setChecked(false);
			    r4.setChecked(false);
			    
			    r5.setChecked(true);
			    r5.setChecked(false);
					/* if(in_gre==co_gre)
					 {
						 if(Answers.equals(userans))
							 CheckGRE("correct");
						 else
							 CheckGRE("incorrect");
					 }*/
		 		}
		         else if(in_cat <= co_cat) {
					 //System.out.println("Search for"+"   "+temp+"    "+"question from CAT");
					if(t1==1)
					{	 userans = radioButton.getText().toString();
						if(Answers.equals(userans))
							CheckGRE("correct");
						else
							CheckGRE("incorrect");
						t1++;
						String[] ques = CreateQuestion("CAT");
						question.setText(ques[1].trim());
						r1.setText(ques[2].trim());
						r2.setText(ques[3].trim());
						r3.setText(ques[4].trim());
						r4.setText(ques[5].trim());
						Answers = ques[6].trim();

						r1.setChecked(false);
						r2.setChecked(false);
						r3.setChecked(false);
						r4.setChecked(false);

						r5.setChecked(true);
						r5.setChecked(false);
					}
					 else {
						String userans = radioButton.getText().toString();


						if (Answers.equals(userans))
							CheckCAT("correct");
						else
							CheckCAT("incorrect");

						String[] ques = CreateQuestion("CAT");
						question.setText(ques[1].trim());
						r1.setText(ques[2].trim());
						r2.setText(ques[3].trim());
						r3.setText(ques[4].trim());
						r4.setText(ques[5].trim());
						Answers = ques[6].trim();

						r1.setChecked(false);
						r2.setChecked(false);
						r3.setChecked(false);
						r4.setChecked(false);

						r5.setChecked(true);
						r5.setChecked(false);
						/*if(in_cat==co_cat)
						{
							if (Answers.equals(userans))
								CheckCAT("correct");
							else
								CheckCAT("incorrect");
						}*/
					}
				 }
		         else if(in_ca <= co_ca)
		         { //System.out.println("Search for"+"   "+temp+"    "+"question from CA");
					 if(t2==1)
					 {	 String userans = radioButton.getText().toString();
						 if (Answers.equals(userans))
							 CheckCAT("correct");
					 	else
						 	CheckCAT("incorrect");
						 t2++;
						 String[] ques = CreateQuestion("cur");
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);
					 }
		        	 else {
						 String userans = radioButton.getText().toString();
						 if (Answers.equals(userans))
							 CheckCA("correct");
						 else
							 CheckCA("incorrect");

						 String[] ques = CreateQuestion("cur");
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);
						 /*if(in_ca==co_ca)
						 {
							 if (Answers.equals(userans))
								 CheckCA("correct");
							 else
								 CheckCA("incorrect");

						 }*/
					 }
		         }
		         else if(in_ap <= co_aptitude)
		         {
					 if(t3==1)
					 {	String userans = radioButton.getText().toString();
						 if (Answers.equals(userans))
						 	CheckCA("correct");
					 	else
							 CheckCA("incorrect");
						 t3++;
						 String[] ques = CreateQuestion("Aptitude");
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);


					 }
					 else {
						 //System.out.println("Search for"+"   "+temp+"    "+"question from aptitude");
						 String userans = radioButton.getText().toString();
						 if (Answers.equals(userans))
							 CheckAP("correct");
						 else
							 CheckAP("incorrect");

						 String[] ques = CreateQuestion("Aptitude");
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);
						 /*if (in_ap == co_aptitude)
						 {
							 if (Answers.equals(userans))
								 CheckAP("correct");
							 else
								 CheckAP("incorrect");
						 }*/
					 }
		         }
		         else if(in_tech <= co_technical)
		         {
					 if(t4==1)
					 {	 String userans = radioButton.getText().toString();
						 if (Answers.equals(userans))
							 CheckAP("correct");
						 else
							 CheckAP("incorrect");
						 t4++;
						 String[] ques = CreateQuestion(techchoi);
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);

					 }
					 else {
						 // System.out.println("Search for"+"   "+temp+"    "+"question from technical");
						 String userans = radioButton.getText().toString();

						 if (Answers.equals(userans))
							 CheckTech("correct");
						 else
							 CheckTech("incorrect");

						 String[] ques = CreateQuestion(techchoi);
						 question.setText(ques[1].trim());
						 r1.setText(ques[2].trim());
						 r2.setText(ques[3].trim());
						 r3.setText(ques[4].trim());
						 r4.setText(ques[5].trim());
						 Answers = ques[6].trim();

						 r1.setChecked(false);
						 r2.setChecked(false);
						 r3.setChecked(false);
						 r4.setChecked(false);

						 r5.setChecked(true);
						 r5.setChecked(false);
						/* if(in_tech==co_technical)
						 {
							 if (Answers.equals(userans))
								 CheckTech("correct");
							 else
								 CheckTech("incorrect");
						 }*/

					 }
		         }
		         else
		         {
					 String userans = radioButton.getText().toString();
					 if (Answers.equals(userans))
						 CheckTech("correct");
					 else
						 CheckTech("incorrect");
		            System.out.println("total no of correct questions is"+count_cans);
		 			 sum=collectedmarktech+collectedmarkaptitude;
		 			 total=noofmarksaptitude+noofmarkstech;
		 			res1 = (sum/total);
		 			//System.out.println("Chance of clearing an interview",+sum+"  "+total);
		 			 sum1=collectedmarkgre+collectedmarkcat+collectedmarkca;
		 			total1=noofmarksca+noofmarkscat+noofmarksgre;
		 			res2 = (sum1/total1);
		 			startActivity(new Intent(getApplicationContext(),Result.class));
		         }
		         
		         
		         

			}
		});
	
		
		
	}

	@Override
	public void onBackPressed() {
	    // do nothing.
	}
	
	public String[] CreateQuestion(String cateory)
	{
		ArrayList<String[]> GREARR = new ArrayList<String[]>();
		if(cateory.equals("GRE")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp+"    "+"question from "+cateory);
		}
		if(cateory.equals("CAT")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp1.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp1+"    "+"question from "+cateory);
		}
		if(cateory.equals("cur")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp2.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp2+"    "+"question from "+cateory);
		}
		if(cateory.equals("Aptitude")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp3.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp3+"    "+"question from "+cateory);
		}
		if(cateory.equals("tech")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp4.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp4+"    "+"question from "+cateory);
		}
		if(cateory.equals("tech_C")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp4.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp4+"    "+"question from "+cateory);
		}
		if(cateory.equals("tech_CI")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp4.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp4+"    "+"question from "+cateory);
		}
		if(cateory.equals("tech_mech")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp4.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp4+"    "+"question from "+cateory);
		}
		if(cateory.equals("tech_EEE")) {
			for (int i = 0; i < Que_Generate.questions.size(); i++) {
				String[] details = Que_Generate.questions.get(i);
				//	Log.i("Arr", details[7] + " " + details[8]);
				if (details[7].trim().equals(cateory) && temp4.equals(details[8].trim())) {
					GREARR.add(details);
				}
			}
			System.out.println("Search for"+"   "+temp4+"    "+"question from "+cateory);
		}

		if(cateory.equals("GRE"))
		in_gre++;
		else if(cateory.equals("CAT"))
			in_cat++;
		else if(cateory.equals("cur"))
			in_ca++;
		else if(cateory.equals("Aptitude"))
			in_ap++;
		else if(cateory.equals("tech"))
			in_tech++;
		else if(cateory.equals("tech_mech"))
			in_tech++;
		else if(cateory.equals("tech_C"))
			in_tech++;
		else if(cateory.equals("tech_CI"))
			in_tech++;
		else if(cateory.equals("tech_EEE"))
			in_tech++;

		
		/*if(in_gre==co_gre)
		{   temp1 = Analysis.arr.get(1).toString();
			System.out.println(temp1);
		}

		else if(in_cat==co_cat)
		{   temp2 = Analysis.arr.get(1).toString();
			System.out.println(temp2);}
		else if(in_ca==co_ca)
		{   temp3 = Analysis.arr.get(1).toString();
			System.out.println(temp3);}
		else if(in_ap==co_aptitude)
		{   temp4 = Analysis.arr.get(1).toString();
			System.out.println(temp4);
		}*/
		Random rr = new Random();
	    int r = rr.nextInt(GREARR.size());
		Log.i("Arr",GREARR.size()+" " );
		return GREARR.get(r);

					
	}
	
	
	public void CheckGRE(String ans)
	{
		
			//System.out.println("Search for"+"   "+temp+"    "+"question from gre");
			//System.out.println("type correct or incorrect");
			String reply=ans;
			if(temp.equals("mediocre"))
				noofmarksgre+=0.25;
			if(temp.equals("moderate"))
				noofmarksgre+=0.50;
			if(temp.equals("good"))
				noofmarksgre+=0.75;
			if(temp.equals("excellent"))
				noofmarksgre+=1.00;
			if(reply.equals("correct"))
			{	int  x;
				count_cor_gre++;
				count_cans++;
				count_que++;
				//System.out.println("Naive Bayes Logic");
				System.out.println("Correct Answer");
				/*P(GRE/yes)=((No of correct questions in gre )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
				double b=(((count_cor_gre)/(count_que)));
				System.out.println(b+""+"value");
				if(temp.equals("mediocre"))
					collectedmarkgre+=0.25;
			if(temp.equals("moderate"))
				collectedmarkgre+=0.50;
			if(temp.equals("good"))
				collectedmarkgre+=0.75;
			if(temp.equals("excellent"))
				collectedmarkgre+=1.00;
				if((a1[0]<=b )&& (b<=a1[1]))
				{
					x=1;
				}
				else if(a2[0]<=b && b<=a2[1])
				{
					x=2;
				}
				else if(a3[0]<=b && b<=a3[1])
				{
					x=3;
				}
				else 
				{
					x=4;
				}
				
				if(temp.equals("mediocre"))
					temp=medi[x];
				if(temp.equals("moderate"))
					temp=moder[x];
				if(temp.equals("good"))
					temp=good[x];
				if(temp.equals("excellent"))
					temp=exe[x];
			
				/*if(tem1.equals("mediocre"))
					tem="easy";
				if(tem1.equals("moderate"))
					tem="medium";
				if(tem1.equals("good"))
					tem="hard";
				if(tem1.equals("excellent"))
					tem="vhard";*/
			}
			if(reply.equals("incorrect"))
			{
					int x;
				
				count_que++;
				//System.out.println("Naive Bayes Logic");
				System.out.println("Incorrect");
				//System.out.println(count_que+"  "+count_cor_gre);
				/*P(GRE/yes)=((No of correct questions in gre )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
				double b=(((count_cor_gre)/(count_que)));
				System.out.println(b+""+"value");
				
				if(a1[0]<=b && b<=a1[1])
				{
					x=1;
				}
				else if(a2[0]<=b && b<=a2[1])
				{
					x=2;
				}
				else if(a3[0]<=b && b<=a3[1])
				{
					x=3;
				}
				else 
				{
					x=4;
				}
				
				if(temp.equals("mediocre"))
					temp=medi[x];
				if(temp.equals("moderate"))
					temp=moder[x];
				if(temp.equals("good"))
					temp=good[x];
				if(temp.equals("excellent"))
					temp=exe[x];
				//jjj
				/*if(tem1.equals("mediocre"))
					tem="easy";
				if(tem1.equals("moderate"))
					tem="medium";
				if(tem1.equals("good"))
					tem="hard";
				if(tem1.equals("excellent"))
					tem="vhard";*/
				
				
			}
			
	
	}
	
	
	public void CheckCAT(String ans)
	{
		
			//System.out.println("Search for"+"   "+temp1+"    "+"question from cat hiiiiiiiiiiiiiiii");
			if(temp1.equals("mediocre"))
				noofmarkscat+=0.25;
			if(temp1.equals("moderate"))
				noofmarkscat+=0.50;
			if(temp1.equals("good"))
				noofmarkscat+=0.75;
			if(temp1.equals("excellent"))
				noofmarkscat+=1.00;
			//System.out.println("type correct or incorrect");
			String reply=ans;
			if(reply.equals("correct"))
			{	int  x;
				count_cor_cat++;
				count_cans++;
				count_que++;
				//System.out.println("Naive Bayes Logic");
				System.out.println("Correct");
				/*P(CAT/yes)=((No of correct questions in CAT )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
				double b=(((count_cor_cat)/(count_que)));

				if(temp1.equals("mediocre"))
					b=b+0.25;
				if(temp1.equals("moderate"))
					b=b+0.40;
				if(temp1.equals("good"))
					b=b+0.50;
				if(temp1.equals("excellent"))
					b=b+0.55;
				System.out.println(b+""+"value");
				if(temp1.equals("mediocre"))
					collectedmarkcat+=0.25;
			if(temp1.equals("moderate"))
				collectedmarkcat+=0.50;
			if(temp1.equals("good"))
				collectedmarkcat+=0.75;
			if(temp1.equals("excellent"))
				collectedmarkcat+=1.00;
				
				if(a1[0]<=b && b<=a1[1])
				{
					x=1;
				}
				else if(a2[0]<=b && b<=a2[1])
				{
					x=2;
				}
				else if(a3[0]<=b && b<=a3[1])
				{
					x=3;
				}
				else 
				{
					x=4;
				}
				
				if(temp1.equals("mediocre"))
					temp1=medi[x];
				if(temp1.equals("moderate"))
					temp1=moder[x];
				if(temp1.equals("good"))
					temp1=good[x];
				if(temp1.equals("excellent"))
					temp1=exe[x];
				//System.out.println("Search for"+"   "+temp1+"    "+"question from cat hiiiiiiiiiiiiiiii");
				/*if(tem1.equals("mediocre"))
					tem="easy";
				if(tem1.equals("moderate"))
					tem="medium";
				if(tem1.equals("good"))
					tem="hard";
				if(tem1.equals("excellent"))
					tem="vhard";*/
			}
			if(reply.equals("incorrect"))
			{
					int x;
				//System.out.println("Search for"+"   "+temp1+"    "+"question from cat helllliiiiiii");
				count_que++;
				//System.out.println("Naive Bayes Logic");
				System.out.println("Incorrect");
				//System.out.println(count_que+"  "+count_cor_gre);
				/*P(CAT/yes)=((No of correct questions in CAT )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/

				double b=(((count_cor_cat)/(count_que)));

				if(temp1.equals("mediocre"))
					b=b+0.05;
				if(temp1.equals("moderate"))
					b=b+0.10;
				if(temp1.equals("good"))
					b=b+0.12;
				if(temp1.equals("excellent"))
					b=b+0.15;
				System.out.println(b+""+"value");
				
				if(a1[0]<=b && b<=a1[1])
				{
					x=1;
				}
				else if(a2[0]<=b && b<=a2[1])
				{
					x=2;
				}
				else if(a3[0]<=b && b<=a3[1])
				{
					x=3;
				}
				else 
				{
					x=4;
				}
				
				if(temp1.equals("mediocre"))
					temp1=medi[x];
				if(temp1.equals("moderate"))
					temp1=moder[x];
				if(temp1.equals("good"))
					temp1=good[x];
				if(temp1.equals("excellent"))
					temp1=exe[x];
				//System.out.println("Search for"+"   "+temp1+"    "+"question from cat hii");
			}
		
	}
	
	
	public void CheckCA(String ans)
	{
		//System.out.println("Search for"+"   "+temp+"    "+"question from current");
		if(temp2.equals("mediocre"))
			noofmarksca+=0.25;
		if(temp2.equals("moderate"))
			noofmarksca+=0.50;
		if(temp2.equals("good"))
			noofmarksca+=0.75;
		if(temp2.equals("excellent"))
			noofmarksca+=1.00;
		//System.out.println("type correct or incorrect");
		String reply=ans;
		if(reply.equals("correct"))
		{	int  x;
			count_cor_ca++;
			count_cans++;
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Correct");
			/*P(CA/yes)=((No of correct questions in CA )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
			double b=(((count_cor_ca)/(count_que)));
			if(temp2.equals("mediocre"))
				b=b+0.30;
			if(temp2.equals("moderate"))
				b=b+0.45;
			if(temp2.equals("good"))
				b=b+0.55;
			if(temp2.equals("excellent"))
				b=b+0.60;
			System.out.println(b+""+"value");
			if(temp2.equals("mediocre"))
				collectedmarkca+=0.25;
		if(temp2.equals("moderate"))
			collectedmarkca+=0.50;
		if(temp2.equals("good"))
			collectedmarkca+=0.75;
		if(temp2.equals("excellent"))
			collectedmarkca+=1.00;
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp2.equals("mediocre"))
				temp2=medi[x];
			if(temp2.equals("moderate"))
				temp2=moder[x];
			if(temp2.equals("good"))
				temp2=good[x];
			if(temp2.equals("excellent"))
				temp2=exe[x];
		
			/*if(tem1.equals("mediocre"))
				tem="easy";
			if(tem1.equals("moderate"))
				tem="medium";
			if(tem1.equals("good"))
				tem="hard";
			if(tem1.equals("excellent"))
				tem="vhard";*/
		}
		if(reply.equals("incorrect"))
		{
				int x;
			
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Incorrect");
			//System.out.println(count_que+"  "+count_cor_gre);
			/*P(CA/yes)=((No of correct questions in CA )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/

			double b=(((count_cor_ca)/(count_que)));

			if(temp2.equals("mediocre"))
				b=b+0.10;
			if(temp2.equals("moderate"))
				b=b+0.12;
			if(temp2.equals("good"))
				b=b+0.15;
			if(temp2.equals("excellent"))
				b=b+0.18;
			System.out.println(b+""+"value");
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp2.equals("mediocre"))
				temp2=medi[x];
			if(temp2.equals("moderate"))
				temp2=moder[x];
			if(temp2.equals("good"))
				temp2=good[x];
			if(temp2.equals("excellent"))
				temp2=exe[x];
		}		
	}
	
	public void CheckAP(String ans)
	{
		//System.out.println("Search for"+"   "+temp+"    "+"question from aptitude");
		if(temp3.equals("mediocre"))
			noofmarksaptitude+=0.25;
		if(temp3.equals("moderate"))
			noofmarksaptitude+=0.50;
		if(temp3.equals("good"))
			noofmarksaptitude+=0.75;
		if(temp3.equals("excellent"))
			noofmarksaptitude+=1.00;
		//System.out.println("type correct or incorrect");
		String reply=ans;
		if(reply.equals("correct"))
		{	int  x;
			count_cor_aptitude++;
			count_cans++;
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Correct");
			/*P(APTI/yes)=((No of correct questions in APTI )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
			double b=(((count_cor_aptitude)/(count_que)));

			if(temp3.equals("mediocre"))
				b=b+0.35;
			if(temp3.equals("moderate"))
				b=b+0.50;
			if(temp3.equals("good"))
				b=b+0.60;
			if(temp3.equals("excellent"))
				b=b+0.65;
			System.out.println(b+""+"value");
			if(temp3.equals("mediocre"))
				collectedmarkaptitude+=0.25;
			if(temp3.equals("moderate"))
				collectedmarkaptitude+=0.50;
			if(temp3.equals("good"))
				collectedmarkaptitude+=0.75;
			if(temp3.equals("excellent"))
				collectedmarkaptitude+=1.00;
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp3.equals("mediocre"))
				temp3=medi[x];
			if(temp3.equals("moderate"))
				temp3=moder[x];
			if(temp3.equals("good"))
				temp3=good[x];
			if(temp3.equals("excellent"))
				temp3=exe[x];
		
			/*if(tem1.equals("mediocre"))
				tem="easy";
			if(tem1.equals("moderate"))
				tem="medium";
			if(tem1.equals("good"))
				tem="hard";
			if(tem1.equals("excellent"))
				tem="vhard";*/
		}
		if(reply.equals("incorrect"))
		{
				int x;
			
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Incorrect");
			//System.out.println(count_que+"  "+count_cor_gre);
			/*P(APTI/yes)=((No of correct questions in APTI )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
			double b=(((count_cor_aptitude)/(count_que)));

			if(temp3.equals("mediocre"))
				b=b+0.10;
			if(temp3.equals("moderate"))
				b=b+0.12;
			if(temp3.equals("good"))
				b=b+0.15;
			if(temp3.equals("excellent"))
				b=b+0.18;
			System.out.println(b+""+"value");
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp3.equals("mediocre"))
				temp3=medi[x];
			if(temp3.equals("moderate"))
				temp3=moder[x];
			if(temp3.equals("good"))
				temp3=good[x];
			if(temp3.equals("excellent"))
				temp3=exe[x];
		}
	}
	
	public void CheckTech(String ans)
	{
		//System.out.println("Search for"+"   "+temp+"    "+"question from technical");
		if(temp4.equals("mediocre"))
			noofmarkstech+=0.25;
		if(temp4.equals("moderate"))
			noofmarkstech+=0.50;
		if(temp4.equals("good"))
			noofmarkstech+=0.75;
		if(temp4.equals("excellent"))
			noofmarkstech+=1.00;
		//System.out.println("type correct or incorrect");
		String reply=ans;
		if(reply.equals("correct"))
		{	int  x;
			count_cor_technical++;
			count_cans++;
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Correct");
			/*P(TECH/yes)=((No of correct questions in TECH )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
			double b=(((count_cor_technical)/(count_que)));

			if(temp4.equals("mediocre"))
				b=b+0.40;
			if(temp4.equals("moderate"))
				b=b+0.55;
			if(temp4.equals("good"))
				b=b+0.65;
			if(temp4.equals("excellent"))
				b=b+0.70;
			System.out.println(b+""+"value");
			if(temp4.equals("mediocre"))
				collectedmarktech+=0.25;
		if(temp4.equals("moderate"))
			collectedmarktech+=0.50;
		if(temp4.equals("good"))
			collectedmarktech+=0.75;
		if(temp4.equals("excellent"))
			collectedmarktech+=1.00;
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp4.equals("mediocre"))
				temp4=medi[x];
			if(temp4.equals("moderate"))
				temp4=moder[x];
			if(temp4.equals("good"))
				temp4=good[x];
			if(temp4.equals("excellent"))
				temp4=exe[x];
		
			/*if(tem1.equals("mediocre"))
				tem="easy";
			if(tem1.equals("moderate"))
				tem="medium";
			if(tem1.equals("good"))
				tem="hard";
			if(tem1.equals("excellent"))
				tem="vhard";*/
		}
		if(reply.equals("incorrect"))
		{
				int x;
			
			count_que++;
			//System.out.println("Naive Bayes Logic");
			System.out.println("Incorrect");
			//System.out.println(count_que+"  "+count_cor_gre);
			/*P(TECH/yes)=((No of correct questions in TECH )/(Total no of correct answers))
				*((Total no of correct answers)/(Total no of questions asked))*/
			double b=(((count_cor_technical)/(count_que)));

			if(temp4.equals("mediocre"))
				b=b+0.10;
			if(temp4.equals("moderate"))
				b=b+0.12;
			if(temp4.equals("good"))
				b=b+0.15;
			if(temp4.equals("excellent"))
				b=b+0.18;
			System.out.println(b+""+"value");
			
			if(a1[0]<=b && b<=a1[1])
			{
				x=1;
			}
			else if(a2[0]<=b && b<=a2[1])
			{
				x=2;
			}
			else if(a3[0]<=b && b<=a3[1])
			{
				x=3;
			}
			else 
			{
				x=4;
			}
			
			if(temp4.equals("mediocre"))
				temp4=medi[x];
			if(temp4.equals("moderate"))
				temp4=moder[x];
			if(temp4.equals("good"))
				temp4=good[x];
			if(temp4.equals("excellent"))
				temp4=exe[x];
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view__question, menu);
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
