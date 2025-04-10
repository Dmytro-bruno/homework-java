package lesson30stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Клас StackExceptionTest — перевіряє винятки стеку при переповненні та під час видалення з порожнього стеку
 */
public class StackExceptionTest {

    /**
     * Перевіряє, що StackUnderflowException кидається при pop з порожнього стеку
     */
    @Test
    void testPopFromEmptyStackThrowsException() {
        Stack<String> stack = new Stack<>(); // Створюємо порожній стек

        // Перевіряємо, що буде кинуто виняток StackUnderflowException
        assertThrows(StackUnderflowException.class, stack::pop);
    }

    /**
     * Перевіряє, що StackOverflowException кидається при push в повний стек
     */
    @Test
    void testPushToFullStackThrowsException() {
        Stack<Integer> stack = new Stack<>(); // Створюємо стек за замовчуванням (10 елементів)

        // Заповнюємо стек повністю
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // Перевіряємо, що при 11-му додаванні буде кинуто виняток StackOverflowException
        assertThrows(StackOverflowException.class, () -> stack.push(11));
    }
}
