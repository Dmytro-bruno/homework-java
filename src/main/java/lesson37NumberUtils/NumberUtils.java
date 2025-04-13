package lesson37NumberUtils;

import java.util.List;

/**
 * Утилітний клас для операцій з числами.
 */
public class NumberUtils {

    /**
     * Метод обчислює суму чисел у списку.
     * @param numbers список чисел типу Number
     * @return сума всіх чисел
     */
    public static double getSum(List<Number> numbers) {
        double sum = 0; // Ініціалізуємо змінну для збереження суми
        for (Number number : numbers) { // Перебираємо всі елементи списку
            sum += number.doubleValue(); // Додаємо кожне число до суми
        }
        return sum; // Повертаємо результат
    }
}