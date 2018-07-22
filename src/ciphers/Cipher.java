package ciphers;
import java.util.Scanner;

public class Cipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String REPLACE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    protected String replaceCharacters(String payload, String source, String target) {

        String atChar = "";
        String newChar = "";
        int i = 0;

        while( i < payload.length()) {
            if (Character.isLetter(payload.charAt(i))) {
                atChar = String.valueOf(target.charAt(source.indexOf(payload.charAt(i))));
                newChar += atChar;
            } else {
              atChar = String.valueOf(payload.charAt(i));
              newChar += atChar;
            }
            i++;
        }
        System.out.println("Returned : " + newChar);
        return newChar;
    }
    public String encode(String payload) {
        return replaceCharacters(payload, ALPHABET, REPLACE_ALPHABET);
    }

    public String decode(String payload) {
        return replaceCharacters(payload, REPLACE_ALPHABET, ALPHABET);
    }
}
