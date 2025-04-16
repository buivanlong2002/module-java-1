import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassificationTest {
    @Test
    @DisplayName("Testing Triangle")
    public void testTriangle1() {
        String result = TriangleClassification.triangleType(2, 2, 3);
        assertEquals("Isosceles Triangle", result);
    }
    @Test
    @DisplayName("Testing Triangle")
    public void testTriangle2() {
        String result = TriangleClassification.triangleType(3, 3, 3);
        assertEquals("Equilateral Triangle", result);
    }
    @Test
    @DisplayName("Testing Triangle")
    public void testTriangle3() {
        String result = TriangleClassification.triangleType(5, 4, 6);
        assertEquals("Regular Triangle", result);
    }
    @Test
    @DisplayName("Testing Triangle")
    public void testTriangle4() {
        String result = TriangleClassification.triangleType(1, 2, 3);
        assertEquals("Not a Triangle", result);
    }
}

