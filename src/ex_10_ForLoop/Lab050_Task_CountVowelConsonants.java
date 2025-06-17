package ex_10_ForLoop;

public class Lab050_Task_CountVowelConsonants {
    //Count vowels and consonants in a String.  -pramod, → vowels - 2, consonants - 4
    public static void main(String[] args) {
        char ch;
        int i,cons_count=0,vowel_count=0;
        String string = "pramod";
        for(i=0;i<string.length();i++){
            ch=string.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowel_count++;
            }
            else if (ch>='a'||ch<='z')
                cons_count++;
        }
        System.out.println("Consonant = "+cons_count+" and Vowel = "+vowel_count);
    }
}
