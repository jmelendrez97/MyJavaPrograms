package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second <10){
            return -1;
        }
        while (first<second){
            for (int i = first; i > 0; i--) {
                if((first % i == 0) && (second % i == 0)) return i;
            }
        }
        for (int i = second; i > 0; i--) {
            if((first % i == 0) && (second % i == 0)) return i;
        }
        return -1;
    }
}
