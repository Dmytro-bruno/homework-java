package lesson40FunctionalInterfaces;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

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
    /**
     * Consumer, який виводить числа від 0 до заданого включно.
     */
    public static final Consumer<Integer> printRange = n -> {
        // Перевірка: якщо число менше 0, не виводимо нічого
        if (n < 0) {
            System.out.println("❌ Число має бути невід’ємним");
            return;
        }
        // Вивід чисел від 0 до n
        System.out.print("📈 Числа від 0 до " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    };

    /**
     * Function, яка округляє число типу Double до Long.
     */
    public static final Function<Double, Long> roundDouble = d -> {
        // Використовуємо стандартне математичне округлення
        return Math.round(d);
    };

}
