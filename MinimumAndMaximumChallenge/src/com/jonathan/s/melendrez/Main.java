package com.jonathan.s.melendrez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	MinMax();
    }



    private static final void MinMax(){
        Scanner s = new Scanner(System.in);
        int range[]={0,0};
        boolean first = true;
        while (true){
            System.out.println("Enter Number: ");
            boolean isInteger =s.hasNextInt();
            if(isInteger){
                int number=s.nextInt();
                if(first){
                    first=false;
                    range[0]=number;range[1]=number;
                }
                if(number>range[1]){
                    range[1]=number;
                }
                if(number<range[0]){
                    range[0]=number;
                }
            }else {

                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Min: "+range[0]+" Max: "+range[1]);
        s.close();

    }
}
