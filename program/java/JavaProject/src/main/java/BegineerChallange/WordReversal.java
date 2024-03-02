package BegineerChallange;

import java.util.Scanner;

public class WordReversal {

    //TODO
    /*
        1. Word reversal
        For this challenge, the input is a string of words, and the output should be the words in reverse but with
        the letters in the original order. For example, the string “Dog bites man” should output as “man bites Dog.”

        After you’ve solved this challenge, try adding sentence capitalization and punctuation to your code.
        So, the string “Codecademy is the best!” should output as “Best the is Codecademy!”
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sbReverseWord = new StringBuilder();

        System.out.print("Enter a words: ");
        String words = scanner.nextLine();
        String[] splitWords = words.split(" ");
        int lengthOfWords = splitWords.length - 1 ;

        for (int i = lengthOfWords; i >= 0; i--){

            if (i == lengthOfWords){
                sbReverseWord.append(capitalize(splitWords[i]));

            } else if (i == 0) {
                sbReverseWord.append(capitalize(splitWords[i]));
            }else {
                sbReverseWord.append(splitWords[i]);
            }

            sbReverseWord.append(" ");
        }

        String finalWords = sbReverseWord.toString().trim();

        System.out.println("Reversed Word: " + finalWords);
    }
    public static String capitalize(String str){
        if (str == null || str.isEmpty())
            return str;
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
