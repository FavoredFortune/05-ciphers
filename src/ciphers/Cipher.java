package ciphers;
import java.util.Scanner;

public class Cipher {

    //declare the only alphabet to be used for all ciphers
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    //declare the alternative (for encode/decode) alphabet - can be overriden by subclasses
    public static String ALT_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static Scanner scanner = new Scanner(System.in);

    public static String hunh = "Sorry,  I don't understand your input." +
            "\nPlease start over and enter only the number.\n";

    public Cipher() {
    }


    public static String plainTextCipher(int codeOption, String message) {
        //First part of interaction with user - choose encode or decode

        if (codeOption == 1) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "encoded: " + encode(message);
        }
        if (codeOption == 2){
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "decoded: " + decode(message);
        } else return hunh;
    }

    public static String encode(String message){
        String newMessageE = Cipher.replaceCharacters(message, ALPHABET, ALT_ALPHABET);
       return newMessageE;
    }

    public static String decode(String message) {
        String newMessageD = Cipher.replaceCharacters(message, ALT_ALPHABET, ALPHABET);
        return newMessageD;
    }

    public static String replaceCharacters(String message, String sourceAlpha, String targetAlpha) {

       String currentCharacter;
       String newCharacter = new String();

        //charAt in java from https://beginnersbook.com/2013/12/java-string-charat-method-example/
        //character is letter from https://stackoverflow
        // .com/questions/4047808/what-is-the-best-way-to-tell-if-a-character-is-a-letter-or-number-in-java-without
        //Ideas for both from classmates Ahmed Ossan and Amy Cohen
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                currentCharacter = String.valueOf(targetAlpha.charAt(sourceAlpha.indexOf(message.charAt(i))));
                newCharacter += currentCharacter;
            } else {
                currentCharacter = String.valueOf(message.charAt(i));
                newCharacter += currentCharacter;
            }
            i++;
        }
        System.out.println("Your altered message: " + newCharacter);
        return newCharacter;
    }
}