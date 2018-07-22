package ciphers;

import java.util.Scanner;

public class KeywordCipher extends Cipher {

    public String keyword;

    public KeywordCipher(String keyword) {
        this.keyword = keyword;
        this.REPLACE_ALPHABET = NewKeyword() + NewAlphabet();
    }

    public String NewKeyword() {
        String newKeyword = "";
        int i =0;
        while (i < keyword.length()) {
            if (!newKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                newKeyword += String.valueOf(keyword.charAt(i));


            }
            i++;
        }
        return newKeyword;
    }
    public String NewAlphabet() {
        String newAlphabet = "";
        int i = 0;
        while (i < ALPHABET.length()) {
            if (!NewKeyword().contains(String.valueOf(ALPHABET.charAt(i)))) {
                newAlphabet += String.valueOf(ALPHABET.charAt(i));

            }
            i++;
        }
        return newAlphabet;
    }

    public String encode (String payload){

        System.out.println("\nplaintext: " + ALPHABET);
        System.out.println("ciphertext: " + REPLACE_ALPHABET+ "\n");

        return replaceCharacters(payload, ALPHABET, REPLACE_ALPHABET);
    }
    public String decode(String payload) {

        System.out.println("\nciphertext: " + ALPHABET);
        System.out.println("plaintext: " + REPLACE_ALPHABET+ "\n");

        return replaceCharacters(payload, REPLACE_ALPHABET, ALPHABET);
    }
}