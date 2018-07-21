package ciphers;

public class KeywordCipher extends Cipher {

    //declare private variable to shift the alphabet by, per user input
    private final String word;

    public KeywordCipher(String word){
        this.word = word;
        //how to shift a string by a certain number from StackOverflow
        //https://stackoverflow.com/questions/33685946/shifting-characters-in-a-string-to-the-left/33686030
        this.ALT_ALPHABET = word + newAlphabet(word);
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
            return "encoded: " +  new KeywordCipher(word).encode(message);
        }
        if (codeOption == 2) {
            System.out.println("Enter your message");
            message = scanner.nextLine();
            return "decoded: " + new KeywordCipher(word).decode(message);
        } else return hunh;
    }

    public static String encode(String message) {
        String newMessageE = Cipher.replaceCharacters(message, Cipher.ALPHABET, ALT_ALPHABET);
        return newMessageE;
    }

    public static String decode(String message) {
        String newMessageD = Cipher.replaceCharacters(message, ALT_ALPHABET, ALPHABET);
        return newMessageD;
    }
}
