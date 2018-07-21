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
            String revisedMessage;
            revisedMessage =  encode(message);
            return "encoded: " + revisedMessage;
        }
        if (codeOption == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            String revisedMessage;
            revisedMessage =  decode(message);
            return "decoded: " + revisedMessage;
        } else return hunh;
    }
}
