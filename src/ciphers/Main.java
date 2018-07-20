package ciphers;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        cipherRequest();
    }

    public static void cipherRequest() {

        String operationAnswer = operation();
        String cipherAnswer = cipherSelection();

        Boolean whileRunning = true;

        while (whileRunning) {
            if (cipherAnswer.equals("1")) {
                Cipher cipher = new Cipher();
                System.out.println("You have selected the Plain Text Cipher");

                if (operationAnswer.equals("1")) {
                    cipher.encode(createPayload());
                } else if (operationAnswer.equals("2")) {
                    cipher.decode(createPayload());
                }
            }else if (cipherAnswer.equals("2")) {
                System.out.println("You have selected the ROT13 Cipher. Please press enter.");
                ROT13Cipher rot13Cipher = new ROT13Cipher();

                if (operationAnswer.equals("1")) {
                    rot13Cipher.encode(createPayload());
                } else if (operationAnswer.equals("2")){
                    rot13Cipher.decode(createPayload());
                }

            } else if (cipherAnswer.equals("3")) {
                System.out.println("You have selected the Caesar Shift Cipher");
                CaesarShiftCipher caesarShift = new CaesarShiftCipher(createShiftedNumber());

                if (operationAnswer.equals("1")) {
                    caesarShift.encode(createPayload());
                } else if (operationAnswer.equals("2")) {
                    caesarShift.decode(createPayload());
                }

            } else if (cipherAnswer.equals("4")) {
                System.out.println("You have selected the keyword Cipher");
                KeywordCipher keywordShift = new KeywordCipher(createKeyword());

                if (operationAnswer.equals("1")) {
                    keywordShift.encode(createPayload());
                } else if (operationAnswer.equals("2")) {
                    keywordShift.decode(createPayload());
                }

            } else {
                System.out.println("That is an incorrect selection.");
            }
            whileRunning = false;
        }
    }

    private static String operation() {

        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                "1: encode\n" +
                "2: decode");
        System.out.print("Your choice: ");
        String operationSelection = input.nextLine();
        System.out.println();

        Boolean isRunning = true;
        while (isRunning) {
            if (operationSelection.equals("1")) {
                System.out.println("You have selected to encode.");
            } else if (operationSelection.equals("2")) {
                System.out.println("You have selected to decode.");
            } else {
                System.out.println("That is in incorrect selection.");
            }
            isRunning = false;
        }
        System.out.println();
        return operationSelection;
    }

    private static String cipherSelection() {
        Scanner cipherInput = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                            "1: Plain Text Cipher\n" +
                            "2: ROT13 Cipher\n" +
                             "3: Caesar Shift Cipher\n" +
                             "4: Keyword Cipher");
        System.out.print("Your choice: ");
        String cipherSelected = cipherInput.nextLine();
        System.out.println();

        return cipherSelected;
    }

    private static String newPayload() {
        System.out.print("Enter your text: ");
        Scanner encodingInput = new Scanner(System.in);
        String payload = encodingInput.nextLine();

        return payload;
    }

    private static String createKeyword() {
        System.out.print("Enter your keyword (then enter twice): ");
        Scanner keywordInput = new Scanner(System.in);
        String keyword = keywordInput.nextLine();
        return keyword;
    }

    private static int createShiftedNumber() {
        System.out.print("Enter shift amount [0-25] (then enter twice): ");
        Scanner shiftingLetters = new Scanner(System.in);
        int shiftedAmount = parseInt(shiftingLetters.nextLine());
        return shiftedAmount;
    }
}