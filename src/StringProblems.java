import java.util.Scanner;

public class StringProblems {

    public static String printTheLetters(String s){
        String f_word = "";

        int length_word = s.length();
        for (int a=0; a<length_word; a++){
            String each_word = s.substring(a,a+1);
            f_word+=each_word+"\n";
        }
        return f_word;
    }
    public static String everyOtherLetter(String s){
        String f_word = "";
        int length_word = s.length();
        for (int a=0; a<length_word;a+=2){
            String each_word = s.substring(a,a+1);
            f_word+=each_word;
        }
        return f_word;
    }
    public static int countTheVowels(String s) {
        int length_word = s.length();
        int count = 0;
        s = s.toLowerCase();
        for (int a=0;a<length_word;a++){
            if(s.substring(a,a+1).equals("i")||s.substring(a,a+1).equals("e")||s.substring(a,a+1).equals("o")||s.substring(a,a+1).equals("u")
            ||s.substring(a,a+1).equals("a"))
                count++;

        }

        return count;
    }
    public static String differentStrings(String s1, String s2) {

        int f_string = s1.length();
        int l_string = s2.length();
        int index=0;
        if (s1.compareTo(s2)==0){

            return s1+" and "+s2+" are the same";
        }
        if (f_string > l_string) {
            for (int a = 0; a < l_string; a++) {
                if (s1.substring(a, a + 1).equals(s2.substring(a, a + 1)) == false) {
                    index = a + 1;


                }
            }
            if (index == 0)
                index = l_string + 1;
        }
        else if (f_string<l_string){
            for (int b=0;b<f_string;b++){
                if(s1.substring(b,b+1).equals(s2.substring(b,b+1))==false){
                    index = b+1;
                break;
                }
            }
            if (index == 0)
                index = f_string + 1;
        }
        else
            for (int b=0;b<f_string;b++) {
                if (s1.substring(b, b + 1).equals(s2.substring(b, b + 1)) == false) {
                    index = b + 1;
                    break;
                }
            }
        return s1+" and "+s2+" are not the same. They differ at letter number "+index;

    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int length = s.length();
        int b = length;
        boolean answer = true;
        for (int a=0; a<length/2; a++){
            if(s.substring(a,a+1).equals(s.substring(b-1,b))==false)
                answer = false;
                    b--;
        }
        return answer;
    }





    public static void main(String[] args){
        System.out.println(isPalindrome("addasgdadhasrdhszdfg"));
    }

}
