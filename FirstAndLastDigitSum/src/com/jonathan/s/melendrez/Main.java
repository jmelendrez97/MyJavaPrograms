package com.jonathan.s.melendrez;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        int digits[]={0,0};// 0 - first 1 -last
        digits[0]=number;
        if(number>=10){
            digits[1]= number%10;
            while (number>=10){
                digits[0]=number/=10;
            }
            return digits[0]+digits[1];
        }
        else if (number>=0){
            return 2*number;
        }
        return -1;
    }
}
