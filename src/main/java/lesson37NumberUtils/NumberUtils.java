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
    /**
     * Метод знаходить усі непарні числа і множить їх на 2.
     * @param numbers список чисел типу Number
     * @return новий список з помноженими непарними числами
     */
    public static List<Integer> multiplyOddNumber(List<Number> numbers) {
        List<Integer> result = new java.util.ArrayList<>(); // Список для збереження результатів

        for (Number number : numbers) { // Перебираємо всі елементи
            int value = number.intValue(); // Перетворюємо в int
            if (value % 2 != 0) { // Перевіряємо на непарність
                result.add(value * 2); // Якщо непарне — множимо на 2 і додаємо
            }
        }

        return result; // Повертаємо результат
    }
}