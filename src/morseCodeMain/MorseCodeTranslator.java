package morseCodeMain;

import logic.MorseCodeLogic;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean menuReel = true;

        while(menuReel)
        {
            System.out.println("This is a Morse Code translator. ");
            System.out.println("********** Select 1 to translate from english to morse code. \n" +
                    "********** Or select 2 to translate from morsecode to english: ");
            int menuNr = Integer.parseInt(scan.nextLine());
            System.out.println();

            //TODO: Add exception handling for numeric input
            if (menuNr == 1) {
                System.out.print("Type words in English and translate it in morse code or type Quit to exit the program: ");
                System.out.println();
                String morseCode = scan.nextLine().toUpperCase();
                if (morseCode.equals("QUIT"))
                    break;
                MorseCodeLogic mc = new MorseCodeLogic();
                String output = mc.getMorseCodesFromWords(morseCode);
                System.out.println("Here is the result: " + output);
                System.out.println("********************************");
            } else if (menuNr==2) {
                System.out.print("Type morse code and translate it into english or type Quit to exit the program: ");
                System.out.println();
                String words = scan.nextLine().toUpperCase() + " ";
                if (words.equals("QUIT"))
                    break;
                MorseCodeLogic mc = new MorseCodeLogic();
                String output = mc.getWordsFromMorseCodes(words);
                System.out.println("Here is the result: " + output);
                System.out.println("********************************");
            }
            else
                System.out.println("Type 1 to translate from english to Morse or 2 to translate from Morse to English.");
        }

    }
}
