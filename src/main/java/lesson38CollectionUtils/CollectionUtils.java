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
}
