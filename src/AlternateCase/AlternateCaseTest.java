package AlternateCase;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AlternateCaseTest {

    @Test
    public void testSomething() {
        assertEquals("", AlternateCase.alternateCase(""));
        assertEquals("ABC", AlternateCase.alternateCase("abc"));
        assertEquals("abc", AlternateCase.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", AlternateCase.alternateCase("Hello World!"));
    }
}
