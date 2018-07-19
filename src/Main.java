

import ciphers.CaesarShiftCipher;
import ciphers.Cipher;
import ciphers.KeywordCipher;
import ciphers.ROT13Cipher;

import java.io.EOFException;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First part of interaction with user - choose encode or decode
        System.out.println("Welcome to this encoding program.");
        System.out.println("Select your operation");
        System.out.println("by typing just the number of your choice");
        System.out.println("1: encode");
        System.out.println("2: decode");
        String answer = scanner.nextLine();
        int choice = codeChoice(answer);

        //Second part of interaction with user - choose cipher
        System.out.println("Select your cipher");
        System.out.println("1: Plain Text Cipher");
        System.out.println("2: ROT13 Cipher" );
        System.out.println("3: Caesar Shift Cipher");
        System.out.println("4: Keyword Cipher");
        System.out.println("by entering just the number of your choice");
        String response = scanner.nextLine();
        Cipher cipher = cipherChoice(response);
        if (choice == 1){
            //give directions
            cipher.encode("hello");
        } else if (choice == 2){
            //give directions
            cipher.decode("ni hao");
        }
    }

    //help from http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html to learn how to
    // accept input from the console
    public static Scanner scanner = new Scanner( System.in );

    public static String hunh = "Sorry,  I don't understand your input." +
            "\nPlease start over and enter only the number.\n";

    public static int codeChoice(String answer) {

        //turn string into integer for boolean test to route user to coorrect choice
        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int codeChoice = Integer.parseInt(answer);
            if (codeChoice == 1) {
                System.out.println("Your choice: 1 encode");
            } else if (codeChoice == 2) {
                System.out.println("Your choice: 2 decode");
            } else {
            System.out.println(hunh);
            }
        return codeChoice;
    }

    public static Cipher cipherChoice(String response){

        //turn string into integer for boolean test to route user to coorrect choice
        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int cipherChoice = Integer.parseInt(response);
        Cipher cipher = null;
            if (cipherChoice == 1 ) {
                System.out.println("Your choice: 1: Plain Text Cipher");
                cipher = new Cipher();
            } else if(cipherChoice == 2){
                System.out.println("Your choice: 2: ROT13 Cipher");
                cipher = new ROT13Cipher();
            }
            else if(cipherChoice == 3){
                System.out.println("Your choice: 3: Caesar Shift");
                //how much to shift
               cipher = new CaesarShiftCipher(3);
            }
            else if(cipherChoice == 4){
                System.out.println("Your choice: 4: Keyword Cipher");
                //whats your keywword
                cipher = new KeywordCipher("hola");
            } else {
            System.out.println(hunh);
             }
        return cipher;
    }


}
