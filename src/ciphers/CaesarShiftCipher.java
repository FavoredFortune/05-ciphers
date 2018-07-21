package ciphers;

public class CaesarShiftCipher extends Cipher{

    //create new alternate alphabet based on shift number for CasearShiftCipher
    public CaesarShiftCipher(int key) {
        //declare private variable to shift the alphabet by, per user input
        int key1 = key;
        //how to shift a string by a certain number from StackOverflow
        //https://stackoverflow.com/questions/33685946/shifting-characters-in-a-string-to-the-left/33686030
        ALT_ALPHABET = Cipher.ALPHABET.substring(key) + Cipher.ALPHABET.substring(0, key);
    }

    public static String useCaesarShiftCipher(int codeOption, int key, String message){
        if (codeOption == 1) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "encoded: " +  new CaesarShiftCipher(key).encode(message);
        }
        if (codeOption == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "decoded: " + new CaesarShiftCipher(key).decode(message);
        } else return hunh;
    }
}

