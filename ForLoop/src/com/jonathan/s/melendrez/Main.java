package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	    /*for(int i=8; i>=2; i--){
            System.out.println("10,000 at "+i+"% interest = " +String.format("%.2f", calculateInterest(10_000,i)));
        }*/

	    int count = 0;
        for(int i=10;i<50; i++){
            if(isPrime(i)==true){
                count++;
                System.out.println("This is a prime number " +i);
                if(count==10){
                    System.out.println("Loop Stopped.");
                    break;
                }
            }
        }

    }
   /* public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }*/
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2;i<=(long) Math.sqrt(n); i++){
            System.out.println("Looping "+ i);
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

}
