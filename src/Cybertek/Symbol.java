package Cybertek;

// write a program that can identify if the given character is a symbol

public class Symbol {
    public static void main(String[] args) {

        char c='D';
        char d ='8';
        char s ='(';

        if ((c>='a' && c<='z')||(c>='A' && c<='Z')) {
            System.out.println(c + " is an Alphabetic");
        }
        if(d>='0' && d<='9') {
            System.out.println(d + " is a digit");
        }
        if(s!=c && s!=d ){
            System.out.println(s+ " is a symbol");
        }
    }
}
