package lesson30stack;

/**
 * Виняток, що сигналізує про переповнення стека.
 */
public class StackOverflowException extends RuntimeException {
    // Конструктор з повідомленням
    public StackOverflowException(String message) {
        super(message); // Викликаємо батьківський конструктор з повідомленням
    }
}
