package HighestAndLowest;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataTest {
    @Test
    public void Test1() {
        assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
