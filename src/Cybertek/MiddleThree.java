package Cybertek;

import java.util.*;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        //&& word.length()>=5
        if(word.length()%2 != 0 ){
            System.out.println(""+word.charAt(word.length()-1/2)+word.charAt(word.length()-1/2+1)+word.charAt(word.length()-1/2+2));
        }else{
            System.out.println("invalid");

        }
    }

}
