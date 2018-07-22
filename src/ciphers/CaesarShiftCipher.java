package ciphers;

public class CaesarShiftCipher extends Cipher {
    public static String REPLACE_ALPHABET = "";
    public int shift;

    public CaesarShiftCipher(int shift) {
        this.shift = shift;
        this.REPLACE_ALPHABET = Cipher.ALPHABET.substring(shift) + Cipher.ALPHABET.substring(0, shift);
    }

    public String encode(String payload) {

        System.out.println("\nplaintext: " + ALPHABET);
        System.out.println("ciphertext: " + REPLACE_ALPHABET+ "\n");

        return replaceCharacters(payload, Cipher.ALPHABET, REPLACE_ALPHABET);
    }
    public String decode(String payload) {

        System.out.println("\nciphertext: " + ALPHABET);
        System.out.println("plaintext: " + REPLACE_ALPHABET+ "\n");

        return replaceCharacters(payload, REPLACE_ALPHABET, Cipher.ALPHABET);
    }
}
