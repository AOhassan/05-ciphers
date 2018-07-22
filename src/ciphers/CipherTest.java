package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    void encodeNonChar() {

        Cipher cipher = new Cipher();
        String payload = "hello, world";
        String actual = cipher.encode(payload);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        Cipher cipher = new Cipher();
        String payload = "hello world";
        String actual = cipher.decode(payload);
        String expected = "hello world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        Cipher cipher = new Cipher();
        String payload = "helloworld";
        String actual = cipher.encode(payload);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        Cipher cipher = new Cipher();
        String payload = "helloworld";
        String actual = cipher.decode(payload);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "hello";
        String actual = cipher.encode(payload);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        Cipher cipher = new Cipher();
        String payload = "hello";
        String actual = cipher.decode(payload);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.encode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        Cipher cipher = new Cipher();
        String payload = "";
        String actual = cipher.decode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }


}