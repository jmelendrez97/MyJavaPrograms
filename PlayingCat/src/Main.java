public class Main {
    public static void main (String[] args){

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        int lowerLimit = 25;
        int upperLimit = summer ? 45 : 35;

        return (temperature >= lowerLimit) && (temperature <= upperLimit);
    }
}
