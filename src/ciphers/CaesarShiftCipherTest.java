package ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftCipherTest {
    @Test
    void encodeNonChar() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "hello, world";
        String actual = cipher.encode(payload);
        String expected = "rovvy, gybvn";

        assertEquals(expected, actual);
    }

    @Test
    void decodeNonChar() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "rovvy, gybvn";
        String actual = cipher.decode(payload);
        String expected = "hello, world";

        assertEquals(expected, actual);
    }

    @Test
    void encodeWord() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "helloworld";
        String actual = cipher.encode(payload);
        String expected = "rovvygybvn";

        assertEquals(expected, actual);
    }

    @Test
    void decodeWord() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "rovvygybvn";
        String actual = cipher.decode(payload);
        String expected = "helloworld";

        assertEquals(expected, actual);
    }

    @Test
    void encodeShortWord() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "hello";
        String actual = cipher.encode(payload);
        String expected = "rovvy";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "rovvy";
        String actual = cipher.decode(payload);
        String expected = "hello";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "";
        String actual = cipher.encode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        int shift = 10;
        Cipher cipher = new CaesarShiftCipher(shift);
        String payload = "";
        String actual = cipher.decode(payload);
        String expected = "";

        assertEquals(expected, actual);
    }
}