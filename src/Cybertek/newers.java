package Cybertek;

public class newers {
    public static void main(String[] args) {
        int[] num1 = new int[3];
        int[] num2={1,2,3,4,5};
        num1=num2;
        for(int x :num1){
            System.out.print( x+":");
        }
    }
}
