package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
	    int myIntValue = 5/2;
	    //width of float = 32 (4 bytes)
	    float myFloatValue = 5F/3f; //'F' or 'f' denotes that the value is 'float'
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d; //'D' or 'd' denotes that the value is 'double'

        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);

        float myPounds = 65.2f;
        float myKG = myPounds * 0.45359237f;
        System.out.print("KG = " +myKG);
    }
}
