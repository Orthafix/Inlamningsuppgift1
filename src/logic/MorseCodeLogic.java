package logic;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeLogic {

    public String getWordsFromMorseCodes(String morseParam) {

        StringBuilder returnWords = new StringBuilder();

        String[] morseCodesSplit = morseParam.split(";"); //split by word
        String[] morseSingleSplit; //empty declaration

        try {
            for (String morse : morseCodesSplit) {

                morseSingleSplit = morse.split(" ");
                for (String singleMorse : morseSingleSplit) {
                    returnWords.append(getOneLetterFromMorseCode(singleMorse + " "));
                }

            }
        } catch (Exception e) {
            System.out.println("Caught an exception of type: " + e + ". Check that input is correct.");
        }
        return returnWords.toString().toUpperCase().stripTrailing();
    }

    public String getMorseCodesFromWords(String words) {

        StringBuilder returnMorseCodes = new StringBuilder();
        try {
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    returnMorseCodes.append("; ");
                } else

                    returnMorseCodes.append(getOneMorseCodeFromLetter(words.toUpperCase().charAt(i)));
            }
        } catch (
                Exception e) {
            System.out.println("Caught an exception of type: " + e + ". Check that input is correct.");
        }
        return returnMorseCodes.toString().stripTrailing();
    }

    public String getOneMorseCodeFromLetter(Character ch) {

        String returnValue = "";

        try {
            HashMap<Character, String> morseCodes = getCharacterStringHashMap();

            //Loop through morse code KeySets and pick any to retrieve its value
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

    public char getOneLetterFromMorseCode(String morseCode) {

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

    // Hashmap for morse-code and letters (declared as private since it is only used in this class)
    private static HashMap<Character, String> getCharacterStringHashMap() {

        HashMap<Character, String> morseCodes = new HashMap<>();

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
        morseCodes.put('W', "*-- ");
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
