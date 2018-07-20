package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeywordCipherTest {

    @Test
    void encodeNonChar() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "hello, world";
        String actual = cipher.encode(payload);
        String expected = "fbkkn, vnqka";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "fbkkn, vnqka";
        String actual = cipher.decode(payload);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "helloworld";
        String actual = cipher.encode(payload);
        String expected = "fbkknvnqka";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "fbkknvnqka";
        String actual = cipher.decode(payload);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "hello";
        String actual = cipher.encode(payload);
        String expected = "fbkkn";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "fbkkn";
        String actual = cipher.decode(payload);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "";
        String actual = cipher.encode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        Cipher cipher = new KeywordCipher("hey");
        String payload = "";
        String actual = cipher.decode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }
}