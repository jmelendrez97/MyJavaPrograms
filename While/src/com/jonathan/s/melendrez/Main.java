package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        int num[] = {4,20};
        int count=0;
        while (num[0] <=num[1]) {

            num[0]++;

            if (!isEvenNumber(num[0])) {

                continue; //bypass prints statement and goes back to the start of the loop (until it's valid)
            }
            System.out.println("Even Number " + num[0]);
            count++;if(count>=5){break;}


        }
        System.out.println(" Total Even Numbers: " + count);
    }
    public static boolean isEvenNumber(int x){
        if (x%2==0){
            return true;
        }else {
        return false;}
    }

    /*int count =1;
    while (count <=5){
        System.out.println("count = " + count);
        count++;
    }*/
}
