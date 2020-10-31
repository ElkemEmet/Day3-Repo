package Cybertek;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numOfMilligrams = scan.nextInt();

        int drink= 10*1000/numOfMilligrams;
        System.out.println("It would take about "+ drink+" drinks for a lethal overdose");

    }
}

