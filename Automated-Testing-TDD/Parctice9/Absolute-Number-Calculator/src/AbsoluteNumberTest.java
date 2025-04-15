import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberTest {
    @Test
    @DisplayName("Testing absolute 0")
    public void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing absolute 11")
    public void testFindAbsolute11() {
        int number = 11;
        int expected = 11;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing absolute -121")
    public void testFindAbsoluteNegative1() {
        int number = -121;
        int expected = 121;

        int result = AbsoluteNumber.findAbsoluteNumber(number);
        assertEquals(expected, result);
    }
}

