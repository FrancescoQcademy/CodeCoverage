import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testClassifyEquilateralTriangle() {
        String result = Triangle.classify(5, 5, 5);
        assertEquals("Equilateral", result);
    }
    @Test
    public void testClassifyIsoscelesTriangle() {
        String result = Triangle.classify(5, 5, 3);
        assertEquals("Isosceles", result);
    }
    @Test
    public void testClassifyScaleneTriangle() {
        String result = Triangle.classify(3, 4, 5);
        assertEquals("Scalene", result);
    }
    @Test
    public void testClassifyInvalidTriangle() {
        String result = Triangle.classify(0, 1, 2);
        assertEquals("Invalid", result);
    }
}
