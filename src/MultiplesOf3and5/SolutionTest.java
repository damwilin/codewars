package MultiplesOf3and5;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }
}
