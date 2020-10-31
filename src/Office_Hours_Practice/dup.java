package Office_Hours_Practice;

import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str= scan.nextLine();

        String result="";

        for(int i =0; i<=str.length()-1; i++){
            String s = ""+ str.charAt(i);
              if(result.contains(s)){
                  continue;
              }else{
                  result += s;
              }
        }

        System.out.println(result);


    }
}
