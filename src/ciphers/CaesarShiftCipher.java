package ciphers;

public class CaesarShiftCipher extends Cipher {
    private String REPLACE_ALPHABET = "";
    public int shift;

    public CaesarShiftCipher(int shift) {
        this.shift = shift;
        this.REPLACE_ALPHABET = Cipher.ALPHABET.substring(shift) + Cipher.ALPHABET.substring(0, shift);
    }

    public String encode(String payload) {

        return replaceCharacters(payload, Cipher.ALPHABET, REPLACE_ALPHABET);
    }
    public String decode(String payload) {

        return replaceCharacters(payload, REPLACE_ALPHABET, Cipher.ALPHABET);
    }
}
