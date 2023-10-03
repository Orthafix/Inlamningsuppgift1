package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import logic.MorseCodeLogic;

public class TestMorseCodeLogic {

    //TODO: Create a unit test for morse code using a hashmap implementation
    @Test
    public void TestLetterToMorseCode()
    {
        //Arrange
        MorseCodeLogic mcLogic = new MorseCodeLogic();
        char ch = '@';
        String expected = "*-";

        //Act
        String actual = mcLogic.getMorseCodeFromLetter(ch);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    //TODO: Create a unit test for morse code from english words to morse
    //TODO: Create a unit test for morse code from morse to english
}
