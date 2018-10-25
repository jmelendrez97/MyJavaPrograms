package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int sumEvenDigits = 0;
        for(int i = number; i > 0; i/=10) {
            //extract least significant value
            int lastDigit = i%10;
            //test and add to sumEvenDigits if lastDigit is an even number
            if(lastDigit%2 == 0) sumEvenDigits += lastDigit;
        }
        return sumEvenDigits;
    }
}
