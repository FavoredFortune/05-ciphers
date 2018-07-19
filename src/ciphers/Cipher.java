package ciphers;
import java.util.Scanner;

public class Cipher {

    //declare the only alphabet to be used for all ciphers
    public static final java.lang.String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    //declare the alternative (for encode/decode) alphabet - can be overriden by subclasses
    public static java.lang.String ALT_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static Scanner scanner = new Scanner(System.in);

    public Cipher() {
//        String message  = this.message ;
//        int codeChoice = this.codeChoice;
    }


    public String plainTextCipher(int codeChoice, String message)

    {
        //First part of interaction with user - choose encode or decode

        if (codeChoice == 1) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "encoded: "+ encode(message);
        } else if (codeChoice == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "decoded: " + decode(message);
        } else {
            return "sorry wrong input";
        }
    }

    public java.lang.String encode(java.lang.String message){
        return replaceCharacters(message, ALPHABET, ALT_ALPHABET);
    }

    public java.lang.String decode(java.lang.String message) {
        return replaceCharacters(message, ALT_ALPHABET, ALPHABET);
    }

    protected java.lang.String replaceCharacters(java.lang.String message, java.lang.String source, java.lang.String target) {
        int index = 0;
        java.lang.String replaceMessage = "";
        java.lang.String replaceLetters = "";
        java.lang.String currentLetter = "";
        java.lang.String holdingLetter = "";

        //charAt in java from https://beginnersbook.com/2013/12/java-string-charat-method-example/
        //character is letter from https://stackoverflow.com/questions/4047808/what-is-the-best-way-to-tell-if-a-character-is-a-letter-or-number-in-java-withou
        for (int i = 0; i < message.length(); i++) {
            if (!Character.isLetter(message.charAt(i))) {
                replaceLetters = replaceMessage + java.lang.String.valueOf(message.charAt(i));
                replaceMessage = replaceLetters;
                continue;
            } else
                index = source.indexOf(message.charAt(i));
            currentLetter = java.lang.String.valueOf(target.charAt(index));
            holdingLetter = currentLetter;
            replaceMessage = replaceLetters += holdingLetter;
        }
        System.out.println("Your altered message: " + replaceMessage);
        return replaceMessage;
    }
}