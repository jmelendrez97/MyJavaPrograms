package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        WhileAndIf();
    }

    //prints numbers from 5-10
    private static final void WhileAndIf(){
        int num=0;  //init
        while (num<15){ //Checks condition if 0 <15 is true
            num++;

            if(num <= 5){ //checks current value of num <=5 is true.
                System.out.println("Skipping Number "+num);
                continue; //bypasses the remaining code at the while loop
            }
            //If the condition reaches false (6<=5), it will print the remaining numbers.
            //The 'if' statement above will print the first 5 numbers from the increment
            System.out.println("Number = " + num);

            //If num reaches the condition of being greater than or equal to 10,
            //The loop will break once it reaches this condition.
            if(num >=10){
                System.out.println("Breaking at " +num);
                break;
            }
        }
    }
}
