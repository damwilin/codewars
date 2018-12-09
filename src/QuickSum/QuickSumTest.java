package QuickSum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class QuickSumTest {

        @Test
        public void testQuicksumBasic() {
            QuickSum quicksumObject = new QuickSum();
            assertEquals(46,quicksumObject.quicksum("ACM"));
            assertEquals(650,quicksumObject.quicksum("MID CENTRAL"));
            assertEquals(15,quicksumObject.quicksum("BBC"));
            assertEquals(0,quicksumObject.quicksum("???"));
            assertEquals(0,quicksumObject.quicksum("axg"));
            assertEquals(0,quicksumObject.quicksum("234 234 WEF ASDF AAA 554211 ???? "));
            assertEquals(75,quicksumObject.quicksum("A C M"));
        }
    }
