package morseCodeMain;

import logic.MorseCodeLogic;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean menuReel = true;

        try {
            while (menuReel) {
                System.out.println("This is a Morse Code translator. ");
                System.out.println("********** Select 1 to translate from english to morse code. \n" + "********** Or select 2 to translate from morsecode to english: ");
                String menuNr = scan.nextLine().toUpperCase();

                if (menuNr.equals("QUIT")) break;

                if (menuNr.equals("1")) {
                    menuReel = isMenu1(scan, menuReel);

                } else if (menuNr.equals("2")) {
                    menuReel = isMenu2(scan, menuReel);
                } else
                    System.out.println("Type 1 to translate from english to Morse or 2 to translate from Morse to English.");
            }
        } catch (Exception e) {
            System.out.println("Incorrect input - start over again.");
        }

    }

    private static boolean isMenu1(Scanner scan, boolean menuReel) {
        System.out.print("Type words in English and translate it in morse code or type Quit to exit the program: ");
        System.out.println();
        String morseCode = scan.nextLine().toUpperCase();

        if (morseCode.equals("QUIT")) menuReel = false;
        MorseCodeLogic mc = new MorseCodeLogic();
        String output = mc.getMorseCodesFromWords(morseCode);
        System.out.println("Here is the result: " + output);
        System.out.println("********************************");
        return menuReel;
    }

    private static boolean isMenu2(Scanner scan, boolean menuReel) {
        System.out.print("Type morse code and translate it into english or type Quit to exit the program: ");
        System.out.println();
        String words = scan.nextLine().toUpperCase() + " ";

        if (words.equals("QUIT")) menuReel = false;
        MorseCodeLogic mc = new MorseCodeLogic();
        String output = mc.getWordsFromMorseCodes(words);
        System.out.println("Here is the result: " + output);
        System.out.println("********************************");
        return menuReel;
    }

}
