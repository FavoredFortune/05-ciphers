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
        codeChoice(answer);

        //Second part of interaction with user - choose cipher
        System.out.println("Select your cipher");
        System.out.println("1: Plain Text Cipher");
        System.out.println("2: ROT13 Cipher" );
        System.out.println("3: Caesar Shift Cipher");
        System.out.println("4: Keyword Cipher");
        System.out.println("by entering just the number of your choice");
        String response = scanner.nextLine();
        cipherChoice(response);
    }

    //help from http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html to learn how to
    // accept input from the console
    private static Scanner scanner = new Scanner( System.in );

    private static String hunh = "Sorry,  I don't understand your input." +
            "\nPlease enter only he number and try again.\n";

    public static int codeChoice(String answer) {

        //turn string into integer for boolean test to route user to coorrect choice
        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int codeChoice = Integer.parseInt(answer);
        try {
            if (codeChoice == 1) {
                System.out.println("Your choice: 1 encode");
            } else if (codeChoice == 2) {
                System.out.println("Your choice: 2 decode");
            }
        } catch (InaccessibleObjectException e) {
            System.err.println("Inaccessible Object Exception." + e.getMessage());
            System.out.println(hunh);
        }
        return codeChoice;
    }

    public static int cipherChoice(String response){

        //turn string into integer for boolean test to route user to coorrect choice
        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int cipherChoice = Integer.parseInt(response);
        try{
            if (cipherChoice == 1 ) {
                System.out.println("Your choice: 1: Plain Text Cipher");
            } else if(cipherChoice == 2){
                System.out.println("Your choice: 2: ROT13 Cipher");
            }
            else if(cipherChoice == 3){
                System.out.println("Your choice: 3: Caesar Shift");
            }
            else if(cipherChoice == 4){
                System.out.println("Your choice: 4: Keyword Cipher");
            }
        } catch (InaccessibleObjectException e){
            System.err.println("Inaccessible Object Exception." + e.getMessage());
            System.out.println(hunh);
        }
        return cipherChoice;
    }


}
