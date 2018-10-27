package YourOrderPlease;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertEquals(YourOrderPlease.order("is2 Thi1s T4est 3a"),"Thi1s is2 3a T4est");
    }

    @Test
    public void test2() {
        assertEquals(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");
    }

    @Test
    public void test3() {
        assertEquals(YourOrderPlease.order(""), "");
    }
}
