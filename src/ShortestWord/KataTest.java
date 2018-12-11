package ShortestWord;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(1, Kata.findShort("i want to travel the world writing code one day"));
    }
}
