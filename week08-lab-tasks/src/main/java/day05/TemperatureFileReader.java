package day05;

import java.util.Arrays;
import java.util.List;

public class TemperatureFileReader extends AbstractFileReader{

    @Override
    public String getFileName() {
        return "weather.dat";
    }

    @Override
    public List<Integer> getFilteredIndexes() {
        return Arrays.asList(0, 1, 32);
    }

    @Override
    public Position getNamePosition() {
        return new Position(2,4);
    }

    @Override
    public Position getNameValue1() {
        return new Position(6,8);
    }

    @Override
    public Position getNameValue2() {
        return new Position(12,14);
    }
}
