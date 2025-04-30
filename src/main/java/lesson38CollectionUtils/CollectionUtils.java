package lesson38CollectionUtils;

import java.util.*;

/**
 * Утиліти для роботи зі списками та мапами.
 */
public class CollectionUtils {

    /**
     * Метод видаляє повтори зі списку, зберігаючи перший елемент і порядок.
     * @param numbers список цілих чисел
     * @return новий список без повторів у початковому порядку
     */
    public static List<Integer> removeDuplicatesPreserveOrder(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>(); // Зберігаємо вже побачені значення
        List<Integer> result = new ArrayList<>(); // Результат без повторів

        for (Integer num : numbers) { // Перебираємо всі числа
            if (!seen.contains(num)) { // Якщо число ще не додавали
                seen.add(num); // Додаємо до множини
                result.add(num); // І в результат
            }
        }
        return result; // Повертаємо новий список
    }
    /**
     * Метод об'єднує дві мапи: якщо ключи збігаються — додає значення.
     * @param map1 перша мапа
     * @param map2 друга мапа
     * @return нова об'єднана мапа
     */
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1); // Копіюємо першу мапу

        for (Map.Entry<String, Integer> entry : map2.entrySet()) { // Перебираємо другу мапу
            result.merge(entry.getKey(), entry.getValue(), Integer::sum); // Якщо ключ є — додаємо, інакше просто вставляємо
        }

        return result; // Повертаємо результат
    }
}
