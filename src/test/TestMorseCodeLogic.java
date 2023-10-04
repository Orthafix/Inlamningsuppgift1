package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import logic.MorseCodeLogic;

public class TestMorseCodeLogic {

    @Test
    public void TestLetterToMorseCode()
    {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        char ch = 'A';
        String expected = "*-";

        //Act
        String actual = mcLogic.getMorseCodeFromLetter(ch);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMorseCodeToLetter() throws Exception {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        String morseCode = "*-";
        char expected = 'A';

        //Act
        char actual = mcLogic.getLetterFromMorseCode(morseCode);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    //TODO: Create a unit test for morse code from english words to morse
    //TODO: Create a unit test for morse code from morse to english
}
