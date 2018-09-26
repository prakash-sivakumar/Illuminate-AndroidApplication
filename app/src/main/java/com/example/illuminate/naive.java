package com.example.illuminate;

import java.io.*;
import java.util.*;
public class naive
{	
	public static String tem,tem1,temp,temp1;

	
	public static void main(String args[])
	{	int co_gre;
		int co_cat;
		int co_ca;
		int  co_aptitude;
		int  co_technical;
		Scanner in=new Scanner(System.in);
		String type[]={"mediocre","moderate","good","excellent"};
		String topic[]={"GRE","CAT","CA","Aptitude","Techdoubleerview"};
		String ans[]=new String[5];
		for(int i=0;i<5;i++)
		{
		System.out.println("Your answer for :"+topic[i]);
		ans[i]=in.nextLine();
		}
		
		System.out.println("Enter no of questions for gre,cat,ca,aptitude,technical in this order");
		
		co_gre=in.nextInt();
		co_cat=in.nextInt();
		co_ca=in.nextInt();
		co_aptitude=in.nextInt();
		co_technical=in.nextInt();
		String medi[]=new String[]{"mediocre","mediocre","moderate","moderate","good"};
		String moder[]=new String[]{"moderate","mediocre","moderate","good","good"};
		String good[]=new String[]{"good","moderate","good","good","excellent"};
		String exe[]=new String[]{"excellent","moderate","good","good","excellent"};
		double a1[]=new double[]{0.0,0.24};
		double a2[]=new double[]{0.25,0.49};
		double a3[]=new double[]{0.50,0.74};
		double a4[]=new double[]{0.75,0.100};
		//domain 2
		double dom2_mediocre[]=new double[]{0.25,0.10};
		double dom2_moderate[]=new double[]{0.40,0.20};
		double dom2_good[]=new double[]{.50,.35};
		double dom2_excellent[]=new double[]{.55,.40};
		//domain 3
		double dom3_mediocre[]=new double[]{.30,.15};
		double dom3_moderate[]=new double[]{.45,.25};
		double dom3_good[]=new double[]{.55,.40};
		double dom3_excellent[]=new double[]{.60,.45};
		//domain 4
		double dom4_mediocre[]=new double[]{.35,.20};
		double dom4_moderate[]=new double[]{.50,.30};
		double dom4_good[]=new double[]{.60,.45};
		double dom4_excellent[]=new double[]{.65,.50};
		//domain 5
		double dom5_mediocre[]=new double[]{.40,.25};
		double dom5_moderate[]=new double[]{.55,.35};
		double dom5_good[]=new double[]{.65,.50};
		double dom5_excellent[]=new double[]{.70,.55};
		temp=ans[0];
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
		//System.out.println(temp+" question will be asked from gre");
			/*if(temp.equals("mediocre"))
				tem="easy";
			if(temp.equals("moderate"))
				tem="medium";
			if(temp.equals("good"))
				tem="hard";
			if(temp.equals("excellent"))
				tem="vhard";*/
		//gre..............................
		for(int i=0;i<co_gre;i++)
		{	
			
			System.out.println("Search for"+"   "+temp+"    "+"question from gre");
			System.out.println("type correct or incorrect");
			String reply=in.nextLine();
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
				System.out.println("Naive Bayes Logic");
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
				System.out.println("Naive Bayes Logic");
				System.out.println(count_que+"  "+count_cor_gre);

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
		//cat.......................................
		temp=ans[1];
		
		for(int i=0;i<co_cat;i++)
		{
			System.out.println("Search for"+"   "+temp+"    "+"question from cat");
			if(temp.equals("mediocre"))
				noofmarkscat+=0.25;
			if(temp.equals("moderate"))
				noofmarkscat+=0.50;
			if(temp.equals("good"))
				noofmarkscat+=0.75;
			if(temp.equals("excellent"))
				noofmarkscat+=1.00;
			System.out.println("type correct or incorrect");
			String reply=in.nextLine();
			if(reply.equals("correct"))
			{	int  x;
				count_cor_cat++;
				count_cans++;
				count_que++;
				System.out.println("Naive Bayes Logic");
				double b=(((count_cor_cat)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.25;
				if(temp.equals("moderate"))
					b=b+0.40;
				if(temp.equals("good"))
					b=b+0.50;
				if(temp.equals("excellent"))
					b=b+0.55;
				//System.out.println(b+""+"value");
				if(temp.equals("mediocre"))
					collectedmarkcat+=0.25;
			if(temp.equals("moderate"))
				collectedmarkcat+=0.50;
			if(temp.equals("good"))
				collectedmarkcat+=0.75;
			if(temp.equals("excellent"))
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
				System.out.println("Naive Bayes Logic");
				//System.out.println(count_que+"  "+count_cor_gre);

				double b=(((count_cor_cat)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.10;
				if(temp.equals("moderate"))
					b=b+0.20;
				if(temp.equals("good"))
					b=b+0.35;
				if(temp.equals("excellent"))
					b=b+0.40;
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
			}
		}
		//current.............................................
		temp=ans[2];
		for(int i=0;i<co_ca;i++)
		{
			System.out.println("Search for"+"   "+temp+"    "+"question from current");
			if(temp.equals("mediocre"))
				noofmarksca+=0.25;
			if(temp.equals("moderate"))
				noofmarksca+=0.50;
			if(temp.equals("good"))
				noofmarksca+=0.75;
			if(temp.equals("excellent"))
				noofmarksca+=1.00;
			System.out.println("type correct or incorrect");
			String reply=in.nextLine();
			if(reply.equals("correct"))
			{	int  x;
				count_cor_ca++;
				count_cans++;
				count_que++;
				System.out.println("Naive Bayes Logic");
				double b=(((count_cor_ca)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.30;
				if(temp.equals("moderate"))
					b=b+0.45;
				if(temp.equals("good"))
					b=b+0.55;
				if(temp.equals("excellent"))
					b=b+0.60;
				//System.out.println(b+""+"value");
				if(temp.equals("mediocre"))
					collectedmarkca+=0.25;
			if(temp.equals("moderate"))
				collectedmarkca+=0.50;
			if(temp.equals("good"))
				collectedmarkca+=0.75;
			if(temp.equals("excellent"))
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
				System.out.println("Naive Bayes Logic");
				//System.out.println(count_que+"  "+count_cor_gre);

				double b=(((count_cor_ca)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.15;
				if(temp.equals("moderate"))
					b=b+0.25;
				if(temp.equals("good"))
					b=b+0.40;
				if(temp.equals("excellent"))
					b=b+0.45;
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
			}	
		}
		temp=ans[3];
		for(int i=0;i<co_aptitude;i++)
		{
			System.out.println("Search for"+"   "+temp+"    "+"question from aptitude");
			if(temp.equals("mediocre"))
				noofmarksaptitude+=0.25;
			if(temp.equals("moderate"))
				noofmarksaptitude+=0.50;
			if(temp.equals("good"))
				noofmarksaptitude+=0.75;
			if(temp.equals("excellent"))
				noofmarksaptitude+=1.00;
			System.out.println("type correct or incorrect");
			String reply=in.nextLine();
			if(reply.equals("correct"))
			{	int  x;
				count_cor_aptitude++;
				count_cans++;
				count_que++;
				System.out.println("Naive Bayes Logic");
				double b=(((count_cor_aptitude)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.35;
				if(temp.equals("moderate"))
					b=b+0.50;
				if(temp.equals("good"))
					b=b+0.60;
				if(temp.equals("excellent"))
					b=b+0.65;
				//System.out.println(b+""+"value");
				if(temp.equals("mediocre"))
					collectedmarkaptitude+=0.25;
				if(temp.equals("moderate"))
					collectedmarkaptitude+=0.50;
				if(temp.equals("good"))
					collectedmarkaptitude+=0.75;
				if(temp.equals("excellent"))
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
				System.out.println("Naive Bayes Logic");
				//System.out.println(count_que+"  "+count_cor_gre);

				double b=(((count_cor_aptitude)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.20;
				if(temp.equals("moderate"))
					b=b+0.30;
				if(temp.equals("good"))
					b=b+0.45;
				if(temp.equals("excellent"))
					b=b+0.50;
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
			}
		}
		//technical...............................
		temp=ans[4];
		for(int i=0;i<=co_technical;i++)
		{
			System.out.println("Search for"+"   "+temp+"    "+"question from technical");
			if(temp.equals("mediocre"))
				noofmarkstech+=0.25;
			if(temp.equals("moderate"))
				noofmarkstech+=0.50;
			if(temp.equals("good"))
				noofmarkstech+=0.75;
			if(temp.equals("excellent"))
				noofmarkstech+=1.00;
			System.out.println("type correct or incorrect");
			String reply=in.nextLine();
			if(reply.equals("correct"))
			{	int  x;
				count_cor_technical++;
				count_cans++;
				count_que++;
				System.out.println("Naive Bayes Logic");
				double b=(((count_cor_technical)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.40;
				if(temp.equals("moderate"))
					b=b+0.55;
				if(temp.equals("good"))
					b=b+0.65;
				if(temp.equals("excellent"))
					b=b+0.70;
				//System.out.println(b+""+"value");
				if(temp.equals("mediocre"))
					collectedmarktech+=0.25;
			if(temp.equals("moderate"))
				collectedmarktech+=0.50;
			if(temp.equals("good"))
				collectedmarktech+=0.75;
			if(temp.equals("excellent"))
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
				System.out.println("Naive Bayes Logic");
				//System.out.println(count_que+"  "+count_cor_gre);

				double b=(((count_cor_technical)/(count_que)));
				if(temp.equals("mediocre"))
					b=b+0.25;
				if(temp.equals("moderate"))
					b=b+0.35;
				if(temp.equals("good"))
					b=b+0.50;
				if(temp.equals("excellent"))
					b=b+0.55;
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
			}
			System.out.println("total no of correct questions is"+count_cans);
			double sum=collectedmarktech+collectedmarkaptitude;
			double total=noofmarksaptitude+noofmarkstech;
			//System.out.println("Chance of clearing an interview",+sum+"  "+total);
			double sum1=collectedmarkgre+collectedmarkcat+collectedmarkca;
			double  total1=noofmarksca+noofmarkscat+noofmarksgre;
			//System.out.println("Chances of clearing competitive exams",+sum1+""+total1);
			
			
		}
	}
}