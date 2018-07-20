package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//encoding an empty string
//decoding an empty string
//encoding a short word
//decoding a short word2
//verifying encoded input is decoded back to the original input properly.
//verifying encoding and decoding ignores non-alphabetic characters (whitespace, numbers, punctuation).
class CipherTest {

    @Test
    void encodeNonChar() {

        Cipher cipher = new Cipher();
        String payload = "hello, world";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        Cipher cipher = new Cipher();
        String payload = "hello world";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "hello world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        Cipher cipher = new Cipher();
        String payload = "helloworld";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        Cipher cipher = new Cipher();
        String payload = "helloworld";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "hello";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "hello";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.replaceCharacters(payload,Cipher.ALPHABET,Cipher.ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }


}