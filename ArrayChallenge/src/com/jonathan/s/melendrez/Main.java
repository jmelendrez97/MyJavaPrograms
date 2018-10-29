package com.jonathan.s.melendrez;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
	Integer[] IntNumbers=getIntegers(5);
	printArray(sortIntegers(IntNumbers));
    }

    private static Integer[] getIntegers(int capacity){
        Integer[] numbers = new Integer[capacity];
        System.out.println("Enter "+capacity+" Integers");
        for (int i=0;i<capacity;i++){
            numbers[i]=s.nextInt();
        }
        return numbers;
    }

    private static Integer[] sortIntegers(Integer[] num){
        Arrays.sort(num, Collections.reverseOrder());
        return num;
    }

    public static void printArray(Integer[] num){
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if ((i<num.length)){
                System.out.println(",");
            }
        }
    }
}
