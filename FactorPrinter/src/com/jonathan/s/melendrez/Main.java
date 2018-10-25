package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	printFactors(32);
    }

    public static void printFactors(int number){
        int factors = 0;
        if(number<1){
            System.out.println("Invalid Value");
        }
        while(number>0){
            for (int i=1;i<=number;i++){
                if(number%i==0){
                    factors=i;
                    System.out.print(factors+" ");
                }
            }
            break; //this shit stops the loop
        }
    }
}
