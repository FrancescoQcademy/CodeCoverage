import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @Test
    public void testIsEven() {
        // Test case for an even number
        assertTrue(NumberUtils.isEven(4));
    }
}
