package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int n1,int n2){
        if((n1<10 || n1>99)||(n2<10 || n2>99)){
            return false;
        }

        int compare[]={0,0};compare[1]=n2;
        while (n1!=0){
            int digit = n1%10;
            while (compare[1]!=0){
                if(digit==compare[1]%10){
                    return true;
                }
                compare[1]/=10;
            }
            compare[1]=n2;
            n1/=10;
        }
        return false;
    }
}
