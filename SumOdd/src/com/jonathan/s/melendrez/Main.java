package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number){
        if (number<0){
            return false;
        }
        else {
            return number%2!=0;
        }
    }
    public static Integer sumOdd(int start, int end){
        int addOdd=0;
        if (start<1 || end < 1 || end<start){ return -1;}

        for(int i=start;i<=end;i++){
            if(isOdd(i)==true){
                addOdd+=i;
            }
        }
        return addOdd;
    }
}
