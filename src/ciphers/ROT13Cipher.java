package ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher {

    //declare the alternative (for encode/decode) alphabet - override for ROT13
    private static String ALT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public ROT13Cipher() {
    }

    public static String useROT13Cipher(int codeOption, String message) {
        if (codeOption == 1) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "encoded: " + encode(message);
        }
        if (codeOption == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "decoded: " + decode(message);
        } else return hunh;
    }

    public static String encode(String message) {
        String newMessageE = Cipher.replaceCharacters(message, Cipher.ALPHABET, ALT_ALPHABET);
        return newMessageE;
    }

    public static String decode(String message) {
        String newMessageD = Cipher.replaceCharacters(message, ALT_ALPHABET, Cipher.ALPHABET);
        return newMessageD;
    }
}
