package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    FileReader fileReader = new FileReader();

    @Test
    void findSmallestTemperatureSpreadTest() {
        int result = fileReader.findSmallestTemperatureSpread("weather.dat");

        assertEquals(14, result);
    }

    @Test
    void findSmallestTeamDifferenceTest() {
        String result= fileReader.findSmallestTeamDifference("football.dat");

        assertEquals("Aston_Villa", result);
    }
}