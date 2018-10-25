package com.jonathan.s.melendrez;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        String output = getDurationString(65,45);
        String output2 = getDurationString(3945L);

        System.out.println(output);
        System.out.println(output2);
        System.out.println(getDurationString(-41));
        System.out.print(getDurationString(65,9));
    }

    private static String getDurationString(long minutes, long seconds){
        String flag="";
        if(minutes >=0 && (seconds >=0 && seconds <=59)){
            long hr = minutes / 60; long remainingMins = minutes % 60;

            String hoursString = hr+"h";
            if(hr<10){
                hoursString="0" + hoursString;
            }
            String minuteString = remainingMins+"m";
            if(remainingMins<10){
                minuteString="0" + minuteString;
            }
            String secondsString = seconds+"s";
            if(remainingMins<10){
                secondsString="0" + secondsString;
            }

            return hoursString +" "+minuteString+" "+secondsString;
        }
        else{
            return INVALID_VALUE_MESSAGE;
        }

    }

    private static String getDurationString(long seconds){
        if(seconds <0){
            return  INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds/60; long remainingSeconds = seconds %60;
        return getDurationString(minutes, remainingSeconds);
    }
   /* new */


}
