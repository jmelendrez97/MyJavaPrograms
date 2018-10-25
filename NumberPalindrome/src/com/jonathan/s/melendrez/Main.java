package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number){

        int num[]={0,0,0}; //0 - reverse 1-last digit
        num[2]=number;
        while (number!=0){
            num[1] = number%10;
            num[0]+= num[1];
            num[0]*=10;

            number /= 10;

        }
        num[0]/=10;
        if(num[0] == num[2]){
        System.out.println(num[2]+ " is a Palindrome");
        return true;}
        else {
            System.out.println(num[2]+ " is not a Palindrome");
            return false;
        }

    }
}
