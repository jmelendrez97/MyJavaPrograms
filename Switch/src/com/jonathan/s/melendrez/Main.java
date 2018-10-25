package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	    char switchVal='G';
	    char c[] = {'A','B','C','D','E'};
	    switch(switchVal){
            case 'A':
                System.out.println("Value is " +c[0]);
                break;
            case 'B':
                System.out.println("Value is " +c[1]);
                break;
            case 'C':case 'D':case 'E':
                System.out.println(switchVal+" Was found");
                break;

                default:
                    System.out.println("Wala");

        }
    }
}
