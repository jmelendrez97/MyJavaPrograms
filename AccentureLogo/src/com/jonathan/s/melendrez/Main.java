package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	logo();
    }

    private static void logo(){
        int linesize[] = {6,10};
        for(int i=0;i<=linesize[0];i++){
            System.out.print("*");

        }
        System.out.println();
        System.out.print(" ");
        for(int i=0;i<=linesize[1];i++){
            System.out.print("*");

        }


    }
}
