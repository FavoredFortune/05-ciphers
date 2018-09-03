package ciphers;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftCipherTest extends Cipher {

    @org.junit.jupiter.api.Test
    void encodeCaesarShiftCipherSmallString() {
        int key = 10;
        Cipher cipher = new CaesarShiftCipher(key);
        String target = "hello world";
        String actual = cipher.encode(target);
        String expected = "rovvy gybvn";

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void decodeCaesarShiftCipherSmallString() {
        int key = 10;
        Cipher cipher = new CaesarShiftCipher(key);
        String target = "rovvy gybvn"; 
        String actual = cipher.decode(target);
        String expected = "hello world";

        assertEquals(expected,actual);
    }
}