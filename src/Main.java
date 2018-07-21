import ciphers.CaesarShiftCipher;
import ciphers.Cipher;
import ciphers.KeywordCipher;
import ciphers.ROT13Cipher;

import java.util.Scanner;

import static ciphers.Cipher.plainTextCipher;
import static ciphers.ROT13Cipher.useROT13Cipher;

public class Main {
    public static void main(String[] args) {

        //invoke helper methods to run program and get user input
        int choice = codeChoice();
        cipherChoice(choice);
        System.out.println(cipherChoice(choice));
    }

    //help from http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html to learn how to
    // accept input from the console
    public static Scanner scanner = new Scanner( System.in );

    //general error message if user inputs anything that isn't a stated option
    public static String hunh = "Sorry,  I don't understand your input." +
            "\nPlease start over and enter only the number.\n";

    // First part of interaction with user - choose encode or decode
    public static int codeChoice() {
        System.out.println("Welcome to this encoding program.");
        System.out.println("Select your operation");
        System.out.println("by typing just the number of your choice");
        System.out.println("1: encode");
        System.out.println("2: decode");
        String answer = scanner.nextLine();

        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int codeOption = Integer.parseInt(answer);
        if (codeOption == 1) {
            System.out.println("Your choice: 1 encode");
        } else if (codeOption == 2) {
            System.out.println("Your choice: 2 decode");
        } else {
        System.out.println(hunh);
        codeChoice();
        }
        return codeOption;
    }

    //Second part of interaction with user - choose cipher
    public static String cipherChoice(int codeOption){

        System.out.println("Select your cipher");
        System.out.println("1: Plain Text Cipher");
        System.out.println("2: ROT13 Cipher" );
        System.out.println("3: Caesar Shift Cipher");
        System.out.println("4: Keyword Cipher");
        System.out.println("by entering just the number of your choice");
        String response = scanner.nextLine();
        Integer cipherChoice = Integer.parseInt(response);

        String cipher = null;
        if (cipherChoice == 1 ) {
            System.out.println("Your choice: 1: Plain Text Cipher");
            System.out.println("Enter your message");
            String messagePT= scanner.nextLine();
            cipher = Cipher.plainTextCipher(codeOption, messagePT);
            return cipher +" end of program.";
        } else if(cipherChoice == 2){
            System.out.println("Your choice: 2: ROT13 Cipher");
            System.out.println("Enter your message");
            String messageROT13= scanner.nextLine();
            cipher = ROT13Cipher.useROT13Cipher(codeOption, messageROT13);
            return cipher + " end of program.";
        }
        else if(cipherChoice == 3){
            System.out.println("Your choice: 3: Caesar Shift");
            System.out.println("How many characters (less than 26) do you want to shift?");
            Integer key = Integer.parseInt(scanner.nextLine());
            if (key < 0 || key >27){
                System.out.println(hunh);
            } else {
                System.out.println("Enter your message");
                String messageCaesar = scanner.nextLine();
                cipher = CaesarShiftCipher.useCaesarShiftCipher(codeOption, key, messageCaesar);
                return cipher;
            }
        }
        else if(cipherChoice == 4){
            System.out.println("Your choice: 4: Keyword Cipher");
            System.out.println("What single word do you want to shift the alphabet with?");
            String word = scanner.nextLine();
            System.out.println("Enter your message");
            String messageKeyword = scanner.nextLine();
            cipher = KeywordCipher.useKeywordCipher(codeOption,word, messageKeyword);
            return cipher;
        } else {
        System.out.println(hunh);
        codeChoice();
        }
        return cipher;
    }
}
