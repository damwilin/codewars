package AlphabetWar;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KataTest {
    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", Kata.alphabetWar("z"));
        assertEquals("Let's fight again!", Kata.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", Kata.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", Kata.alphabetWar("wwwwwwz"));
    }
}
