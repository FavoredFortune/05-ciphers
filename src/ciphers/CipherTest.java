package ciphers;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest extends Cipher {

    @org.junit.jupiter.api.Test
    void encodePlainTextShortWord() {
        String target = "java";
        String expected = target;
        String actual = Cipher.encode(target);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void encodePlainTextLongString() {
        String target = "java is ultra cool";
        String expected = target;
        String actual = Cipher.encode(target);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void encodePlainEmptyString() {
        String target = "";
        String expected = target;
        String actual = Cipher.encode(target);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void decodeShortWord() {
        String target = "java";
        String expected = target;
        String actual = Cipher.decode(target);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void decodeLongString() {
        String target = "java is wicked awesome";
        String expected = target;
        String actual = Cipher.decode(target);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void replaceCharactersEncode() {

        String target = "java is wicked awesome";
        String expected = target;
        String actual = Cipher.replaceCharacters(target,ALPHABET,ALT_ALPHABET);

        assertEquals(expected,actual);
    }
}