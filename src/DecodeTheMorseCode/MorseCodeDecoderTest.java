package DecodeTheMorseCode;

import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static junit.framework.TestCase.assertEquals;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }
}
