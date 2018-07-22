package ciphers;

import java.util.Scanner;

import static ciphers.Cipher.ALPHABET;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        cipherType();
    }

    public static void cipherType() {

        String cipherAnswer = typeOfCipher();
        String answer = coder();
        boolean run = true;

        while (run) {
            if (cipherAnswer.equals("1")) {
                Cipher cipher = new Cipher();

                if (answer.equals("1")) {
                    System.out.println("\nYou're encoding with the Plain Text Cipher.\n");
                    cipher.encode(newPayload());
                } else if (answer.equals("2")) {
                    System.out.println("\nYou're decoding with the Plain Text Cipher.\n");
                    cipher.decode(newPayload());
                }
            }else if (cipherAnswer.equals("2")) {
                ROT13Cipher rot13 = new ROT13Cipher();

                if (answer.equals("1")) {
                    System.out.println("\nYou're encoding with the Rot13 Cipher.\n");
                    rot13.encode(newPayload());
                } else if (answer.equals("2")){
                    System.out.println("\nYou're decoding with the Rot13 Cipher.\n");
                    rot13.decode(newPayload());
                }

            } else if (cipherAnswer.equals("3")) {
                CaesarShiftCipher caesarCipher = new CaesarShiftCipher(newShift());

                if (answer.equals("1")) {
                    System.out.println("\nYou're encoding with the Caesar Shift Cipher.\n");
                    caesarCipher.encode(newPayload());
                } else if (answer.equals("2")) {
                    System.out.println("\nYou're decoding with the Caesar Shift Cipher.\n");
                    caesarCipher.decode(newPayload());
                }

            } else if (cipherAnswer.equals("4")) {
                KeywordCipher keywordCipher = new KeywordCipher(newKeyword());

                if (answer.equals("1")) {
                    System.out.println("\nYou're encoding with the Keyword Cipher.\n");
                    keywordCipher.encode(newPayload());
                } else if (answer.equals("2")) {
                    System.out.println("\nYou're decoding with the Keyword Cipher.\n");
                    keywordCipher.decode(newPayload());
                }
            } else {
                System.out.println("invalid input.");
            }
            run = false;
        }
    }
    private static String coder() {

        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                           "1: encode\n" +
                           "2: decode\n");
        System.out.print("Your choice: ");
        String encodeDecode = input.nextLine();
        System.out.println();

        Boolean running = true;
        while (running) {
            if (encodeDecode.equals("1")) {
            } else if (encodeDecode.equals("2")) {
            } else {
                System.out.println("invalid input.");
            }
            running = false;
        }
        System.out.println();
        return encodeDecode;
    }

    private static String typeOfCipher() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                           "1: Plain Text Cipher\n" +
                           "2: ROT13 Cipher\n" +
                           "3: Caesar Shift Cipher\n" +
                           "4: Keyword Cipher\n");
        System.out.print("Your choice: ");
        String choice = userInput.nextLine();
        System.out.println();
        return choice;
    }
    private static String newPayload() {
        System.out.print("\nEnter text: ");
        Scanner encodeInput = new Scanner(System.in);
        String payload = encodeInput.nextLine();

        return payload;
    }
    public static int newShift() {
        System.out.print("Enter shift amount [0-25]: ");
        Scanner input = new Scanner(System.in);
        int shift = parseInt(input.nextLine());

        return shift;
    }
    private static String newKeyword() {
        System.out.print("\nEnter your keyword: ");
        Scanner keywordInput = new Scanner(System.in);
        String keyword = keywordInput.nextLine();

        return keyword;
    }
}