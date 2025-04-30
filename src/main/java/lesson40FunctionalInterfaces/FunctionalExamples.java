package lesson40FunctionalInterfaces;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Клас з прикладами використання Predicate та Supplier.
 */
public class FunctionalExamples {

    /**
     * Predicate, який перевіряє, чи є передане число простим.
     */
    public static final Predicate<Integer> isPrime = number -> {
        // Просте число має бути більше 1
        if (number <= 1) return false;

        // Перевірка дільників від 2 до квадратного кореня з числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Якщо ділиться без остачі — не просте
            if (number % i == 0) return false;
        }
        // Якщо не знайшли дільників — число просте
        return true;
    };

    /**
     * Supplier, який повертає випадковий день тижня.
     */
    public static final Supplier<String> randomDayOfWeek = () -> {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Генеруємо випадковий індекс
        int index = new Random().nextInt(days.length);
        // Повертаємо день за індексом
        return days[index];
    };
}
