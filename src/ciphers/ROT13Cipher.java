package ciphers;

import java.util.Scanner;


public class ROT13Cipher extends Cipher {


    public static String REPLACE_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public String encode(String payload) {

        return replaceCharacters(payload, ALPHABET, REPLACE_ALPHABET);
    }

    public String decode(String payload) {

        return replaceCharacters(payload, REPLACE_ALPHABET, ALPHABET);

    }

}

