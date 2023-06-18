import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class FruitCounter {
    public static int countCitrusFruits(List<String> fruits) {
        int citrusCount = 0;
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (isCitrusFruit(fruit)) {
                citrusCount++;
            }
        }
        return citrusCount;
    }

    private static boolean isCitrusFruit(String fruit) {
        // Implementiere hier deine Logik zur Überprüfung, ob die Frucht eine Zitrusfrucht ist
        // Beispiel: Rückgabe true, wenn die Frucht eine Zitrusfrucht ist, ansonsten false
        // Du kannst deine eigene Implementierung hier einfügen

        switch (fruit.toLowerCase()) {
            case "orange":
            case "lemon":
            case "grapefruit":
            case "lime":
                return true;
        }
        return false;
    }
}
