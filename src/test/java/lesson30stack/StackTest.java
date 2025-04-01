package lesson30stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Клас StackTest — перевіряє основні методи реалізації стеку
 */
public class StackTest {

    @Test
    public void testPushAndPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        assertEquals("Java", stack.peek(), "❌ Метод peek повертає неправильне значення");
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(42);
        Integer value = stack.pop();
        assertEquals(42, value, "❌ Метод pop не повертає правильний елемент");
        assertTrue(stack.isEmpty(), "❌ Стек має бути порожнім після pop");
    }

    @Test
    public void testIsEmpty() {
        Stack<Double> stack = new Stack<>();
        assertTrue(stack.isEmpty(), "❌ Новий стек має бути порожнім");
        stack.push(3.14);
        assertFalse(stack.isEmpty(), "❌ Стек має бути не порожнім після push");
    }

    @Test
    public void testIsFull() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i); // Заповнюємо стек
        }
        assertTrue(stack.isFull(), "❌ Стек має бути повним після 10 елементів");
    }

    @Test
    public void testPopFromEmptyStack() {
        Stack<String> stack = new Stack<>();
        String result = stack.pop();
        assertNull(result, "❌ pop повинен повертати null, якщо стек порожній");
    }

    @Test
    public void testPushToFullStack() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.push(11); // Понад ліміт
        assertEquals(9, stack.peek(), "❌ Елемент не повинен додаватись, коли стек повний");
    }
}
