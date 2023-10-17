package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import logic.MorseCodeLogic;

public class TestMorseCodeLogic {

    @Test
    public void TestAllLettersToMorseCodes() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.,?";
        String expected = "*- -*** -*-* -** * **-* --* **** ** *--- -*- *-** -- -* --- *--* --*- *-* *** - **- ***- " +
                "*-- -**- -*-- --** *---- **--- ***-- ****- ***** -**** --*** ---** ----* ----- *-*-*- --**-- **--**";

        //Act
        String actual = mcLogic.getMorseCodesFromWords(letters);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAllMorseCodesToLetters() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();

        String morse = "*- -*** -*-* -** * **-* --* **** ** *--- -*- *-** -- -* --- *--* --*- *-* *** - **- ***- *-- " +
                "-**- -*-- --** *---- **--- ***-- ****- ***** -**** --*** ---** ----* ----- *-*-*- --**-- **--**";
        String expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.,?";

        //Act
        String actual = mcLogic.getWordsFromMorseCodes(morse);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMorseCodesToWords() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();

        String morse = "**** * *--- ; **** * *--- ";
        String expected = "HEJ HEJ";

        //Act
        String actual = mcLogic.getWordsFromMorseCodes(morse);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBadMorseCodesToWords() {
        //Bad morse code will yield null output

        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();

        String morse = "***. ***/";
        String expected = "";

        //Act
        String actual = mcLogic.getWordsFromMorseCodes(morse);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWordsToMorseCodes() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String words = "Hej Hej"; //Notera här att orden innehåller gemener som hanteras i logiken via toUpper().
        String expected = "**** * *--- ; **** * *---";

        //Act
        String actual = mcLogic.getMorseCodesFromWords(words);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBadWordsToMorseCodes() {
        //Bad letters will yield empty output

        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String words = "&%¤";
        String expected = "";

        //Act
        String actual = mcLogic.getMorseCodesFromWords(words);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneLetterToMorseCode() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        char ch = 'A';
        String expected = "*- ";

        //Act
        String actual = mcLogic.getOneMorseCodeFromLetter(ch);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneBadLetterToMorseCode() {
        //Bad letter results in empty result
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        char ch = '@';
        String expected = "";

        //Act
        String actual = mcLogic.getOneMorseCodeFromLetter(ch);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneMorseCodeToLetter() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String morseCode = "*- ";
        char expected = 'A';

        //Act
        char actual = mcLogic.getOneLetterFromMorseCode(morseCode);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestOneBadMorseCodeToLetter() {
        //Bad letters will result in empty morse code
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String morseCode = "%¤";
        char expected = ' ';

        //Act
        char actual = mcLogic.getOneLetterFromMorseCode(morseCode);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

}
