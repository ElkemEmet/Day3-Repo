package Cybertek;

//Write an if statement that will print day of the week based on value of the day variable.

public class WeekDay {
    public static void main(String[] args) {
        int num = 9;
        String day = "";
        if (num == 1) {
            day = "Monday";
        }
       else  if (num == 2) {
            day = "Tuesday";
        }
        else if (num == 3) {
            day = "Wednesday";
        }else if (num == 4) {
            day = "Thursday";
        }else if (num == 5) {
            day = "Friday";
        }else if (num == 6) {
            day = "Saturday";
        }else if (num == 7) {
            day = "Sunday";
        }else{
            day="There is no such a day!";
        }
        System.out.println(day);
}}