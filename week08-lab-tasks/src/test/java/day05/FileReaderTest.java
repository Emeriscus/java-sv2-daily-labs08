package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    @Test
    void findSmallestTemperatureSpreadTest() {
        String result = new TemperatureFileReader().findSmallestDifferenceName();

        assertEquals("14", result);
    }

    @Test
    void findSmallestTeamDifferenceTest() {
        String result= new TeamsFileReader().findSmallestDifferenceName();

        assertEquals("Aston_Villa", result);
    }
}
