package CheckThreeAndTwo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CheckThreeAndTwoTest {
    @Test
    public void testSomething() {
        assertEquals(true, CheckThreeAndTwo.checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, CheckThreeAndTwo.checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, CheckThreeAndTwo.checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }
}
