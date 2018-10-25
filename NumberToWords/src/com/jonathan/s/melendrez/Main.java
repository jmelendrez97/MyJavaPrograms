package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	numberToWords(123);
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        else {
            int num[] = {0,reverse(number),0}; num[2]=num[1];
            while (num[1]>0){
                num[0] = num[1] %10;
                switch (num[0]){
                    case 0:
                        System.out.println("Zero"); break;
                    case 1:
                        System.out.println("One"); break;
                    case 2:
                        System.out.println("Two"); break;
                    case 3:
                        System.out.println("Three"); break;
                    case 4:
                        System.out.println("Four"); break;
                    case 5:
                        System.out.println("Five"); break;
                    case 6:
                        System.out.println("Six"); break;
                    case 7:
                        System.out.println("Seven"); break;
                    case 8:
                        System.out.println("Eight"); break;
                    case 9:
                        System.out.println("Nine"); break;
                }
                num[1]/=10;
            }
            while (getDigitCount(number) > getDigitCount(num[2])){num[2]*=10;
                System.out.println("Zero");}
        }
    }

    public static int reverse(int number){
        int num[] = {0,0};
        while (number!=0){
            num[0] = number%10;
            num[1]*=10;
            num[1]+=num[0];
            number/=10;
        }
        return num[1];
    }
    public static int getDigitCount(int number){
        int count=0;
        if(number<0){return -1;}else if(number==0){return 1;}
        while (number!=0){count++; number/=10;} return count;
    }
}
