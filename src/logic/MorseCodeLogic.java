package logic;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeLogic {

    //TODO: Implement morse code logic that return a hashmap according to the International Morse Code
    // First implement so that one of the morse codes is translated to a letter, and go from there
    // Create a HashMap object called morseCodes
    public String getMorseCodeFromLetter(Character ch) {

        String returnValue = "";

        try {
            HashMap<Character, String> morseCodes = getCharacterStringHashMap();

            //Loop through morse code KeySets and pick any to retrieve it's value
            for (Character i : morseCodes.keySet()) {
                if (i == ch) {
                    returnValue = morseCodes.get(i);
                }
            }

        } catch (Exception e) {
            System.out.println("Caught an exception of type: " + e + ". Check that input is correct.");
        }
        return returnValue;
    }

    public char getLetterFromMorseCode(String morseCode) {
        char returnKey = ' ';
        HashMap<Character, String> morseCodes = getCharacterStringHashMap();

        try {
            //Loops through each entry (key, value pair) in a entrySet to get the "getValue" method
            for (Map.Entry<Character, String> entry : morseCodes.entrySet()) {
                if (entry.getValue().equals(morseCode)) {
                    returnKey = entry.getKey();
                }
            }
        } catch (Exception e) {
            System.out.println("Caught an exception of type: " + e + ". Check that input is correct.");
        }
        return returnKey;
    }

    public String getMorseCodesFromWords(String words) {

        StringBuilder returnMorseCodes = new StringBuilder();

        try {
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    returnMorseCodes.append("; ");
                } else
                    returnMorseCodes.append(getMorseCodeFromLetter(words.toUpperCase().charAt(i)));
            }
        } catch (
                Exception e) {
            System.out.println("Caught an exception of type: " + e + ". Check that input is correct.");
        }
        return returnMorseCodes.toString().stripTrailing();
    }

    private static HashMap<Character, String> getCharacterStringHashMap() {

        HashMap<Character, String> morseCodes = new HashMap<Character, String>();

        // Add keys and values (Letter, Morse code)
        morseCodes.put('A', "*- ");
        morseCodes.put('B', "-*** ");
        morseCodes.put('C', "-*-* ");
        morseCodes.put('D', "-** ");
        morseCodes.put('E', "* ");
        morseCodes.put('F', "**-* ");
        morseCodes.put('G', "--* ");
        morseCodes.put('H', "**** ");
        morseCodes.put('I', "** ");
        morseCodes.put('J', "*--- ");
        morseCodes.put('K', "-*- ");
        morseCodes.put('L', "*-** ");
        morseCodes.put('M', "-- ");
        morseCodes.put('N', "-* ");
        morseCodes.put('O', "--- ");
        morseCodes.put('P', "*--* ");
        morseCodes.put('Q', "--*- ");
        morseCodes.put('R', "*-* ");
        morseCodes.put('S', "*** ");
        morseCodes.put('T', "- ");
        morseCodes.put('U', "**- ");
        morseCodes.put('V', "***- ");
        morseCodes.put('w', "*-- ");
        morseCodes.put('X', "-**- ");
        morseCodes.put('Y', "-*-- ");
        morseCodes.put('Z', "--** ");
        morseCodes.put('1', "*---- ");
        morseCodes.put('2', "**--- ");
        morseCodes.put('3', "***-- ");
        morseCodes.put('4', "****- ");
        morseCodes.put('5', "***** ");
        morseCodes.put('6', "-**** ");
        morseCodes.put('7', "--*** ");
        morseCodes.put('8', "---** ");
        morseCodes.put('9', "----* ");
        morseCodes.put('0', "----- ");
        morseCodes.put('.', "*-*-*- ");
        morseCodes.put(',', "--**-- ");
        morseCodes.put('?', "**--** ");
        return morseCodes;
    }

}
