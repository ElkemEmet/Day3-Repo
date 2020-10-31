package Cybertek;

//SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,2004-2006 and
// 2015-2017. write a program that can check if the vehicle is eligible to recall.
//        if eligible, print: true
//        otherwise: false
public class If_RecallModel {
    public static void main(String[] args) {

        int recall =1994;
        boolean car =  (recall>=1995 && recall<=1998) && (recall>=2001&&recall<=2002)&& (recall>=2004&&recall<=2006)&&(recall>=2015&&recall<=2017);

        if(car=true){
            System.out.println("true");
        } else{
            System.out.println("false");
            }
        }

    }

