package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ROT13CipherTest {

    @Test
    void encodeNonChar() {

        Cipher cipher = new ROT13Cipher();
        String payload = "hello, world";
        String actual = cipher.encode(payload);
        String expected = "uryyb, jbeyq";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        Cipher cipher = new ROT13Cipher();
        String payload = "uryyb, jbeyq";
        String actual = cipher.decode(payload);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        Cipher cipher = new ROT13Cipher();
        String payload = "helloworld";
        String actual = cipher.encode(payload);
        String expected = "uryybjbeyq";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        Cipher cipher = new ROT13Cipher();
        String payload = "uryybjbeyq";
        String actual = cipher.decode(payload);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        Cipher cipher = new ROT13Cipher();
        String payload = "hello";
        String actual = cipher.encode(payload);
        String expected = "uryyb";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        Cipher cipher = new ROT13Cipher();
        String payload = "uryyb";
        String actual = cipher.decode(payload);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        Cipher cipher = new ROT13Cipher();
        String payload = "";
        String actual = cipher.encode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        Cipher cipher = new ROT13Cipher();
        String payload = "";
        String actual = cipher.decode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }

}