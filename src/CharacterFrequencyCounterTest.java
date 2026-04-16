import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    void TestCharacterShowsUpMultipleTimesGivesCorrectFrequency() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //Act
        int actual = counter.getFrequency('l');
        //Assert
        assertEquals(2, actual);
    }   
    
    @Test
    void TestGetRelativeFrequencyReturns0ForMissingCharacter() {
        //arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hellow");

        //act
        double actual = counter.getRelativePercentage('x');
        //assert
        assertEquals(0.0, actual, 0.0001);
    }
}