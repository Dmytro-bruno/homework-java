package lesson38CollectionUtils;


import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit-тести для методів класу CollectionUtils.
 */
public class CollectionUtilsTest {

    @Test
    void testRemoveDuplicatesPreserveOrder() {
        // Вхідний список з повтореннями
        List<Integer> input = List.of(1, 2, 1, 3, 2, 4, 1);
        // Очікуваний результат: лише перші входження, порядок збережено
        List<Integer> expected = List.of(1, 2, 3, 4);

        // Викликаємо метод і перевіряємо
        List<Integer> actual = CollectionUtils.removeDuplicatesPreserveOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void testMergeMaps() {
        // Дві мапи з деякими спільними ключами
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 1);
        map2.put("d", 5);

        // Очікуваний результат після об'єднання
        Map<String, Integer> expected = Map.of(
                "a", 1, // з map1
                "b", 5, // 2 + 3
                "c", 4, // 3 + 1
                "d", 5  // з map2
        );

        // Перевіряємо результат
        Map<String, Integer> actual = CollectionUtils.mergeMaps(map1, map2);
        assertEquals(expected, actual);
    }
}
