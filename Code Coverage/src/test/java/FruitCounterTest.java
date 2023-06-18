import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FruitCounterTest {
    //@Test
    public void testCountCitrusFruits_allCitrus() {
        // Testfall: Liste mit Zitrusfrüchten
        List<String> citrusFruits = Arrays.asList("Orange", "Lemon", "Grapefruit", "Lime");
        int result1 = FruitCounter.countCitrusFruits(citrusFruits);
        assertEquals(4, result1);
    }
    @Test
    public void testCountCitrusFruits_mixed() {
        // Testfall: Liste mit einer Zitrusfrucht und einer anderen Frucht
        List<String> mixedFruits = Arrays.asList("Apple", "Orange");
        int result2 = FruitCounter.countCitrusFruits(mixedFruits);
        assertEquals(1, result2);
    }
    @Test
    public void testCountCitrusFruits_emptyArray() {
        // Testfall: Leere Liste
        List<String> emptyList = Arrays.asList();
        int result3 = FruitCounter.countCitrusFruits(emptyList);
        assertEquals(0, result3);
    }
    @Test
    public void testCountCitrusFruits_allNegative() {
        // Testfall: Liste mit nicht-zitrusfrüchten
        List<String> nonCitrusFruits = Arrays.asList("Apple", "Banana", "Grapes");
        int result4 = FruitCounter.countCitrusFruits(nonCitrusFruits);
        assertEquals(0, result4);
    }
}
