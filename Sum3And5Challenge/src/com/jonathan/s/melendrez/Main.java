package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	    Sum3And5();
    }
    private static void Sum3And5(){
        int count=0;
        int total=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                count++;
                total+=i;

                System.out.println("Found: "+i);
            }
            if(count==5){
                break;
            }
        }
        System.out.println("Sum = "+total);
    }
}
