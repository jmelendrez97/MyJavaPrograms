package com.jonathan.s.melendrez;

public class Main {
	public static void main(String[] args){
	//System.out.println("");
	calcFeetAndInchesToCentimeters(6,-1);
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		if(feet >= 0 && (inches>=0 && inches<=12)){
			double cm = (feet*12) *2.54;
			cm+=inches *2.54d;
			System.out.println(feet+" feet,"+inches+" inches = "+cm+"cm");
			return feet+inches;
		}
		else{
			return -1;
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches){
		if(inches>=0){
			double feet = inches/12; //feet
			return  calcFeetAndInchesToCentimeters(feet,inches);
		}
		else{
			return -1;
		}
	}


}


