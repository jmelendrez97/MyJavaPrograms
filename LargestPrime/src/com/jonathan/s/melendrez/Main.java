package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));
    }
//study this shit
    public static int getLargestPrime(int number){
        //find the largest prime factor first
        int i=0;if(number<=1){return -1;}while(number>1){ for (i=2;i<=number;i++){ if(number%i==0){number/=i; i--; } } }return i;
    }

}
