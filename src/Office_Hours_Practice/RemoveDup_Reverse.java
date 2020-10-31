package Office_Hours_Practice;

public class RemoveDup_Reverse {

    public static void main(String[] args) {

        String str = "Batch20";

        String reslut = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reslut += str.charAt(i);
        }
        System.out.println(reslut);






    }
}
