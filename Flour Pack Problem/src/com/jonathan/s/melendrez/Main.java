package com.jonathan.s.melendrez;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(-3,2,12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean bool=false;
        int kg[]={5,1}; bigCount*=kg[0]; smallCount*=kg[1];
            if(goal>(bigCount+smallCount)||goal<=0){
                bool = false;
            }else{
                if (goal%kg[0]==0 || smallCount>=goal){bool = true;}
                else {while ((goal-5)>0){
                    goal-=5;
                    if(goal<=smallCount){
                        bool=true;
                        break;
                         }
                }
                }

            }

        return bool;
    }
}
