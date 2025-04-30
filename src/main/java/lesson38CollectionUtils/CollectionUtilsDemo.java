package lesson38CollectionUtils;

import java.util.*;

public class CollectionUtilsDemo {
    public static void main(String[] args) {
        // Демонстрація removeDuplicatesPreserveOrder
        List<Integer> list = List.of(1, 2, 1, 3, 2, 4, 1);
        List<Integer> unique = CollectionUtils.removeDuplicatesPreserveOrder(list);
        System.out.println("Унікальні числа: " + unique); // Очікується: [1, 2, 3, 4]

        // Демонстрація mergeMaps
        Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> map2 = Map.of("b", 3, "c", 1, "d", 5);

        Map<String, Integer> merged = CollectionUtils.mergeMaps(map1, map2);
        System.out.println("Об'єднана мапа: " + merged); // Очікується: {a=1, b=5, c=4, d=5}
    }
}