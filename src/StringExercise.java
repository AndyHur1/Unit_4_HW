public class StringExercise {
    public static String printTheLetters(String s){
        String f_word = "";

        int length_word = s.length();
        for (int a=0; a<length_word; a++){
            String each_word = s.substring(a,a+1);
            f_word+= "\n"+each_word;
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


    public static void main(String[] args){
        System.out.println(everyOtherLetter("Computer Science"));
    }

}
