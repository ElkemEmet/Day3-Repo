package Cybertek;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport="";
        if(isTall){
            if(isFast){
                sport="Basketball";
            }else if(isFlexible){
                sport="Gymnastics";
            }else{ sport="Volleyball";
        }
}else{
       if(isFast) {
           sport = "soccer";
       }else{
           sport="tennis";
       }
        }

        System.out.println(sport);
        }
    }