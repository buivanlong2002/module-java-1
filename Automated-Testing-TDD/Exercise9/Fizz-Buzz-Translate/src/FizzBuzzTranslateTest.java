import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
    @Test
    @DisplayName("Testing number 13")
    public void testNumber13() {
        String result = FizzBuzzTranslate.translate(13);
        assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("Testing number 15")
    public void testNumber15() {
        String result = FizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    @DisplayName("Testing number 56")
    public void testNumber56() {
        String result = FizzBuzzTranslate.translate(56);
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("Testing number 47")
    public void testNumber47() {
        String result = FizzBuzzTranslate.translate(47);
        assertEquals("bốn mươi bảy", result);
    }
}
