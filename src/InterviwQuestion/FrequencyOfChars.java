package InterviwQuestion;

public class FrequencyOfChars {

    public static void main(String[] args) {
    //steps: remove duplicates
    //frequency
    //combine
        String str ="OOPQQ";
        String nonDup="";

        for(int i =0;i<=str.length()-1;i++){
            String s = ""+str.charAt(i);
             if( !nonDup.contains(s)){
                 nonDup+=s;
             }
        }

        String result="";

        for(int j=0;j<=nonDup.length()-1;j++){

            char ch1 = nonDup.charAt(j);
            int count =0;
            for(int i = 0; i<=str.length()-1;i++){
                char each= str.charAt(i);
                if(each==ch1){
                    count+=1;
                }
            }

            result+= ""+ch1+count;
        }
            System.out.println(result);
    }
}
