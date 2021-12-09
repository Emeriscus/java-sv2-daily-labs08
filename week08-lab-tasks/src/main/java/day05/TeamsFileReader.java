package day05;

import java.util.Arrays;
import java.util.List;

public class TeamsFileReader extends AbstractFileReader{

    @Override
    public String getFileName() {
        return "football.dat";
    }

    @Override
    public List<Integer> getFilteredIndexes() {
        return Arrays.asList(0, 18);
    }

    @Override
    public Position getNamePosition() {
        return new Position(7,22);
    }

    @Override
    public Position getNameValue1() {
        return new Position(43,45);
    }

    @Override
    public Position getNameValue2() {
        return new Position(50,52);
    }
}
