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
            System.out.println("********************************");
            System.out.print("Type a word in English and translate it in morse code or type Quit to exit the program: ");
            String morseCode = scan.nextLine().toUpperCase();
            if (morseCode.equals("QUIT"))
                break;
            MorseCodeLogic mc = new MorseCodeLogic();
            String output = mc.getMorseCodesFromWords(morseCode);
            System.out.println("Here is the result: " + output);
            System.out.println("********************************");
        }

    }
}
