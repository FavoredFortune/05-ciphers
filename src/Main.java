import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int encode = 1;
        int decode = 2;
        int plainText = 1;
        int rot13 = 2;
        int caeser = 3;
        int keyword =5;

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this encoding program.\n Select your operation\n" + "1: encode"+"\n" + decode +
                "\n" + "by typing just the number of your choice" );
        String input = scanner.nextLine();
        //turn string into integer for boolean test to route user to coorrect choice
        //source for help https://www.mkyong.com/java/java-convert-string-to-int/
        int inputResult = Integer.parseInt(input);
         try{
           if(inputResult == 1 ){
               System.out.println("Your choice: 1 encode");
           } else if(inputResult == 2 )){
               System.out.println("Your choice: 2 decode");
           }
           catch (InaccessibleObjectException e){
                 System.out.println("Sorry,  I don't understand your input. \n" + "Please enter only the number 1 or 2 " + "and try again\n");
             }

        System.out.println("Select your cipher\n" + "1: Plain Text Cipher\n" + "2: ROT13 Cipher\n" + "3: Caesar Shift" +
                " Cipher\n" + "4: Keyword Cipher\n" +"by entering just the number of your choice\n");

        input = scanner.nextLine();
             //turn string into integer for boolean test to route user to coorrect choice
             //source for help https://www.mkyong.com/java/java-convert-string-to-int/
              inputResult = Integer.parseInt(input);
         try{
             if (inputResult == 1 ) {
                 System.out.println("Your choice: 1: Plain Text Cipher");
             } else if(inputResult == 2){
                 System.out.println("Your choice: 2: ROT13 Cipher");
             }
             else if(input == 3){
                 System.out.println("Your choice: 3: Caesar Shift");
             }
             else if(input == 4){
                 System.out.println("Your choice: 4: Keyword Cipher");
             }
         }catch (InaccessibleObjectException e){
                 System.out.println("Sorry,  I don't understand your input. \n" + "Please enter only the number of " +
                         "your choice: 1, 2, 3 or 4.\n");
             }
         }
    }

    //help from http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/JavaIO_Scanner.html to learn how to
    // accept input from the console
    private static Scanner scanner = new Scanner( System.in );
}
