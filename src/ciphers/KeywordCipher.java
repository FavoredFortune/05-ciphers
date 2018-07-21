package ciphers;

import java.security.Key;

public class KeywordCipher extends Cipher {

    public KeywordCipher(String word){
        //declare private variable to shift the alphabet by, per user input
        //how to shift a string by a certain number from StackOverflow
        //https://stackoverflow.com/questions/33685946/shifting-characters-in-a-string-to-the-left/33686030
        ALT_ALPHABET = word + newAlphabet(word);
    }

    //charAt in java from https://beginnersbook.com/2013/12/java-string-charat-method-example/
    //Idea for use from Ahmed Ossan
    public String newAlphabet(String word){
        String revisedAlphabet = "";
        int index = 0;
        while (index < ALPHABET.length()){
            if(!word.contains(String.valueOf(ALPHABET.charAt(index)))){
                revisedAlphabet += String.valueOf(ALPHABET.charAt(index));
                index++;
            }
        }return revisedAlphabet;
    }

    public static String useKeywordCipher(int codeOption, String word, String message){
        if (codeOption == 1) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            String returnMessage = new KeywordCipher(word).encode(message);
            return "encoded: " + returnMessage + "\nEnd of program.";
        }
        if (codeOption == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            String returnMessage = new KeywordCipher(word).decode(message);
            return "decoded: " + returnMessage + "\nEnd of program.";
        } else return hunh;
    }
}
