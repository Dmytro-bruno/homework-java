package lesson30stack;
import java.util.Optional;
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
        assertEquals("Java", stack.peek(), "Метод peek повертає неправильне значення");
    }

    @Test
    public void testPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(42);
        Integer value = stack.pop();
        assertEquals(42, value, "Метод pop не повертає правильний елемент");
        assertTrue(stack.isEmpty(), "Стек має бути порожнім після pop");
    }

    @Test
    public void testIsEmpty() {
        Stack<Double> stack = new Stack<>();
        assertTrue(stack.isEmpty(), "Новий стек має бути порожнім");
        stack.push(3.14);
        assertFalse(stack.isEmpty(), "Стек має бути не порожнім після push");
    }

    @Test
    public void testIsFull() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i); // Заповнюємо стек
        }
        assertTrue(stack.isFull(), "Стек має бути повним після 10 елементів");
    }
    @Test
    public void testPopOptional() {
        Stack<String> stack = new Stack<>();

        // Перевірка для порожнього стеку
        Optional<String> emptyResult = stack.popOptional();
        assertTrue(emptyResult.isEmpty(), "Optional має бути порожнім при порожньому стеку");

        // Додаємо елемент і перевіряємо
        stack.push("Hello");
        Optional<String> result = stack.popOptional();
        assertTrue(result.isPresent(), "Optional має містити значення");
        assertEquals("Hello", result.get(), "Значення в Optional неправильне");
    }
}
