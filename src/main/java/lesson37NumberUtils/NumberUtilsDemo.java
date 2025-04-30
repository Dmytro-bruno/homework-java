package lesson37NumberUtils;

import java.util.List;

/**
 * Демонстрація роботи методів класу NumberUtils.
 */
public class NumberUtilsDemo {
    public static void main(String[] args) {
        // Створюємо приклад списку чисел
        List<Number> numbers = List.of(1, 2, 3, 4.5, 5);

        // Демонстрація методу getSum
        double sum = NumberUtils.getSum(numbers); // Обчислюємо суму
        System.out.println("Сума: " + sum); // Виводимо результат

        // Демонстрація методу multiplyOddNumber
        List<Integer> multiplied = NumberUtils.multiplyOddNumber(numbers); // Множимо непарні числа на 2
        System.out.println("Помножені непарні: " + multiplied); // Виводимо список результатів
    }
}