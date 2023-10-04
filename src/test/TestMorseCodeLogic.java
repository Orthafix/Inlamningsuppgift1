package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import logic.MorseCodeLogic;

public class TestMorseCodeLogic {

    //TODO: Create a unit test for morse code from english words to morse
    @Test
    public void TestWordsToMorseCodes() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String words = "Hej Hej"; //Notera här att orden innehåller gemener som ska hanteras i logiken via toUpper().
        String expected = "**** * *--- ; **** * *---";
        String expectedBad = "_*_*____";

        //Act
        String actual = mcLogic.getMorseCodesFromWords(words);

        //Assert
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedBad, actual);
    }

    @Test
    public void TestLetterToMorseCode() {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        char ch = 'A';
        String expected = "*- ";
        String expectedBad = "_*_*____";

        //Act
        String actual = mcLogic.getMorseCodeFromLetter(ch);

        //Assert
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedBad, actual);
    }

    @Test
    public void TestMorseCodeToLetter() throws Exception {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String morseCode = "*- ";
        char expected = 'A';
        char expectedBad = '$';

        //Act
        char actual = mcLogic.getLetterFromMorseCode(morseCode);

        //Assert
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedBad, actual);
    }

    //TODO: Create a unit test for morse code from morse to english
}
