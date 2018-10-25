package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(41,22,71));
    }

        public static boolean hasSameLastDigit(int a, int b, int c) {

            if ((a<10 || a>1000) || (b<10 || b>1000) || (c<10 || c>1000)) return false;

            return (a%10 == b%10) || (a%10 == c%10) || (b%10 == c%10);
        }

}
