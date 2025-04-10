package lesson30stack;

/**
 * Виняток, що сигналізує про спробу видалити елемент з порожнього стека.
 */
public class StackUnderflowException extends RuntimeException {
    // Конструктор з повідомленням
    public StackUnderflowException(String message) {
        super(message); // Викликаємо батьківський конструктор з повідомленням
    }
}
