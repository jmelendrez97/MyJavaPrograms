public class Main {
    public static void main(String args[]){
        System.out.println(isPerfectNumber(496));
    }

    public static boolean isPerfectNumber(int number){
        int allSum=0;
        if(number<1){return false;}
        while(number>0){
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    allSum+=i;
                }
                if(number==allSum){return true;}
            }
        break;
        }
        return false;

    }

}
