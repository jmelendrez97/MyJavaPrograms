package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(-1.0,4.0));
    }
    private static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        double pi = 3.14_1_59d;
        double area = (radius*radius) *pi;
        return area;
    }
    private static double area(double x, double y){
        if(x <0 || y <0){
            return -1.0;
        }
        double area = x*y;
        return area;
    }
}
