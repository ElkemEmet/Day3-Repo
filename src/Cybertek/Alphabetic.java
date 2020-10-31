package Cybertek;
//
// write a program that can identify if the given character character is Alphabetic

public class Alphabetic {
    public static void main(String[] args) {

        char c='D';
        if ((c>='a' && c<='z')||(c>='A' && c<='Z')) {
            System.out.println(c + " is an Alphabetic");
        }else {
            System.out.println(c + " is not an Alphabetic");
        }
    }
}