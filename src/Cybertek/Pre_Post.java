package Cybertek;

public class Pre_Post {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        //  49  + 49 +  50  + 49;
        System.out.println(a);

        int x = 4;
        int y = x*4 - x++;
        System.out.println(y);

        int c =1;
        c =-c-- + c++ / -c-- * --c;
        System.out.println(c);

        System.out.println("=====================");

       int A = 1;
       A = -A--;
        System.out.println(A);

    }
}
