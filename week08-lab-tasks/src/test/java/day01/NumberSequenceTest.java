package day01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    NumberSequence numberSequence = new NumberSequence(Arrays.asList(5, 7, 8, 9, 10, 6));

    @Test
    void closeToAverageTest() {
        List<Integer> result = numberSequence.closeToAverage(2);

        assertEquals(4, result.size());
        assertArrayEquals(new Integer[]{7,8,9,6}, result.toArray());
    }

    @Test
    void createNumberSequenceTest(){
        NumberSequence numberSequence=new NumberSequence(Arrays.asList(2,3,45,6,7,8));

        assertEquals(6,  numberSequence.getNumbers().size());
        assertEquals(45, numberSequence.getNumbers().get(2));
    }
}