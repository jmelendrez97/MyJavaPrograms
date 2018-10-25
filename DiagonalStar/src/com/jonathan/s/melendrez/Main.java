package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	printSquareStar(6);
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else{
            for(int x=1;x<=number;x++){
                for(int y=1;y<=number;y++){
                    if((x==1) || (y==1) || (x==number) || (y==number)|| (x==y) || (y == ((number - x)+1))){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

    }
    /*public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else {
            for(int i = 1; i<=number; i++){ // row
                for(int j = 1; j<=number; j++){ // column
                    if((i==1) || (j==1) || (i==number) || (j==number)|| (i==j) || (j == ((number - i)+1))){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }*/
}
