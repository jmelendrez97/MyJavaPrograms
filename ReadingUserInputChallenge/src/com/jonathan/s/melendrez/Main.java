package com.jonathan.s.melendrez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	readUserInputs();
    }
    private static final void readUserInputs(){
        Scanner s= new Scanner(System.in);
        int val[]={0,0,0};
        while (true){
            int order=val[0]+1;
            System.out.print("Enter Number# "+order+" ");boolean inputcheck =s.hasNextInt();
            if(inputcheck){
                val[2] = s.nextInt();
                val[0]++; val[1]+=val[2];
                if(val[0]==10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
            s.nextLine(); //handles the 'enter' key to make sure it doesn't proceed with a blank value.
        }
        System.out.println("Sum is: "+val[1]);
s.close();
    }
}
