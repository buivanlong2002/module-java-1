import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing day 2025-01-01")
    public void testNextDay112025() {
        String result = NextDayCalculator.getNextDay(2025, 1, 1);
        assertEquals("2025-01-02", result);
    }
    @Test
    @DisplayName("Testing day 2025-01-31")
    public void testNextDay31012025() {
        String result = NextDayCalculator.getNextDay(2025, 1, 31);
        assertEquals("2025-02-01", result);
    }
    @Test
    @DisplayName("Testing day 2025-04-30")
    public void testNextDay30042025() {
        String result = NextDayCalculator.getNextDay(2025, 4, 30);
        assertEquals("2025-05-01", result);
    }
    @Test
    @DisplayName("Testing day 2024-02-29")
    public void testNextDay29022024() {
        String result = NextDayCalculator.getNextDay(2024, 2, 29);
        assertEquals("2024-03-01", result);
    }
}

