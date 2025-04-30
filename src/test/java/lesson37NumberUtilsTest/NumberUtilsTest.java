package lesson37NumberUtilsTest;

import org.junit.jupiter.api.Test;
import java.util.List;
import lesson37NumberUtils.NumberUtils;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit-тести для методів класу NumberUtils.
 */
public class NumberUtilsTest {

    @Test
    void testGetSum() {
        List<Number> numbers = List.of(1, 2.5, 3);
        double expected = 6.5; // Очікувана сума
        double actual = NumberUtils.getSum(numbers); // Фактична сума
        assertEquals(expected, actual, 0.0001); // Перевіряємо результат
    }

    @Test
    void testMultiplyOddNumber() {
        List<Number> numbers = List.of(1, 2, 3, 4, 5); // Вхідний список
        List<Integer> expected = List.of(2, 6, 10); // Очікуваний список (непарні помножені на 2)
        List<Integer> actual = NumberUtils.multiplyOddNumber(numbers); // Отримуємо результат
        assertEquals(expected, actual); // Порівнюємо
    }
}