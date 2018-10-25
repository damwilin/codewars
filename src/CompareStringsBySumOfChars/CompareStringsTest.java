package CompareStringsBySumOfChars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CompareStringsTest {
    @Test
public void BasicTests() {
    assertEquals(true, CompareStrings.compare("AD", "BC"));
    assertEquals(false, CompareStrings.compare("AD", "DD"));
}
}
