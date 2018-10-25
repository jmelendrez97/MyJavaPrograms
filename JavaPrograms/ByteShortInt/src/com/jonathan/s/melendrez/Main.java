 package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
 //CHALLENGE 18:36 https://accentureatcp.udemy.com/java-the-complete-java-developer-course/learn/v4/t/lecture/3133018?start=0
        byte myByte = 5;
        short myShort = 127;
        int myInt = 69;
        long myLong = 50_000L + 10 * (myByte + myShort + myInt);
        short shortTotal = (short)(1000 +10 * (myByte + myShort + myInt));

        System.out.println("myLong = "+myLong);
        System.out.println("shortTotal = "+shortTotal);
    }
}
