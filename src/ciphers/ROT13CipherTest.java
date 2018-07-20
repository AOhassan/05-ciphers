package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ROT13CipherTest {

    @Test
    void encodeNonChar() {

        Cipher cipher = new Cipher();
        String payload = "hello, world";
        String actual = cipher.replaceCharacters(payload, Cipher.ALPHABET,ROT13Cipher.REPLACE_ALPHABET);
        String expected = "uryyb, jbeyq";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        Cipher cipher = new Cipher();
        String payload = "uryyb, jbeyq";
        String actual = cipher.replaceCharacters(payload,ROT13Cipher.REPLACE_ALPHABET, Cipher.ALPHABET);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        Cipher cipher = new Cipher();
        String payload = "helloworld";
        String actual = cipher.replaceCharacters(payload, Cipher.ALPHABET,ROT13Cipher.REPLACE_ALPHABET);
        String expected = "uryybjbeyq";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        Cipher cipher = new Cipher();
        String payload = "uryybjbeyq";
        String actual = cipher.replaceCharacters(payload,ROT13Cipher.REPLACE_ALPHABET, Cipher.ALPHABET);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "hello";
        String actual = cipher.replaceCharacters(payload, Cipher.ALPHABET,ROT13Cipher.REPLACE_ALPHABET);
        String expected = "uryyb";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "uryyb";
        String actual = cipher.replaceCharacters(payload,ROT13Cipher.REPLACE_ALPHABET, Cipher.ALPHABET);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.replaceCharacters(payload, Cipher.ALPHABET,ROT13Cipher.REPLACE_ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.replaceCharacters(payload,ROT13Cipher.REPLACE_ALPHABET, Cipher.ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

}