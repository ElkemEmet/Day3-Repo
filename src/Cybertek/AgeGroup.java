package Cybertek;
//write a program that can define the age groups of a person
//age groups are:
//                    baby (< 3 year)
//                    Toddler (3 - 5),
//                    Kid (6 - 9),
//                    Pre-Teen (10 - 12),
//                    Teenager (13 - 17),
//                    Young Adult (18 - 20),
//                    Adult (21 - 39),
//                    Young Middle-Aged Adult (40 - 49),
//                    Middle-Aged Adult (50 - 54),
//                    Very Young Senior Citizen (55 - 64),
//                    Young Senior Citizen (65 - 74),
//                    Senior Citizen (75 - 84),
//                    Old Senior Citizen (85+)
//                    if age > 150 or less than 0 ==> invalid entry
public class AgeGroup {
    public static void main(String[] args) {
        int age=1;
        String person ="";
        if(age<3 && age>0){
            person="baby";
        }else if(age>3 && age<5){
            person="Toddler";
        }else if(age>6 && age<9) {
            person = "kid";
        }else if(age>10&&age<12) {
            person = "Pre-Teen";
        }else if(age>13&&age<17){
            person="Teenager";
        }else if(age>18 && age<20){
            person ="Young Adult";
        }else if(age>21 &&age<39){
            person="Adult";
        }else if(age>40 && age<49){
            person="Young Middle-Aged Adult";
        }else if(age>50 && age<54){
            person="Middle-Aged Adult";
        }else if( age>55 && age<64){
            person="Very Young Senior Citizen";
        }else if(age>65 && age<74){
            person="Young Senior Citizen";
        }else if(age>75 && age<84) {
            person = "Senior Citizen";
        }else if(age>85 && age<150){
            person="Old Senior Citizen";
        }else if(age>150 || age<0){
            person="invalid entry";
        }
        System.out.println(person);
        }
}
