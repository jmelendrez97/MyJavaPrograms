package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(1);
    }
    static void printDayOfTheWeek(int day){
//        switch (day){
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//                default:
//                    System.out.println("Invalid Day");
        String days[] = {"Sunday",
        "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
        "Friday",
        "Saturday"};

        if(day == 0){
            System.out.println(days[0]);
        }
        else if(day == 1){
                System.out.println(days[1]);
            }
        else if(day == 2){
            System.out.println(days[2]);
        }
        else if(day == 3){
            System.out.println(days[3]);
        }
        else if(day == 4){
            System.out.println(days[4]);
        }
        else if(day == 5){
            System.out.println(days[5]);
        }
        else if(day == 6){
            System.out.println(days[6]);
        }
        else{
            System.out.println("Invalid Day");
        }
        }
    }



