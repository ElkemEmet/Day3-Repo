package Cybertek;

//1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
//Write a program that declares three integers as angles and check whether a triangle
//is valid or not.
//
//        Note: MUST use if&else statement
public class If_Else_Traiangle {
    public static void main(String[] args) {

        double angele1 = 100;
        double angele2 = 90;
        double angels3 = 20;

        boolean valid = angele1+angele2+angels3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }else{System.out.println("invalid Triangle");
        }


        }
    }

