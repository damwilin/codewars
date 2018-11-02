package ExesAndOhs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XoTest {
    @Test
    public void testSomething1() {
        assertEquals(true, Xo.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, Xo.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, Xo.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, Xo.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, Xo.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, Xo.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, Xo.getXO("Xxxxertr34"));
    }
}
