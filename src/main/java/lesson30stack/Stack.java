package lesson30stack;

/**
 * Клас Stack — реалізація структури даних стек (LIFO)
 * @param <E> тип елементів у стеку
 */
public class Stack<E> implements Stackable<E> {
    private static final int DEFAULT_CAPACITY = 10; // 🔹 Розмір стеку за замовчуванням
    private Object[] elements; // 🔹 Масив для збереження елементів
    private int top; // 🔹 Індекс вершини стеку (-1 означає порожній стек)

    /**
     * Конструктор за замовчуванням
     */
    public Stack() {
        elements = new Object[DEFAULT_CAPACITY]; // 🔹 Створюємо масив фіксованого розміру
        top = -1; // 🔹 Стек порожній на старті
    }

    /**
     * Перевірка, чи стек порожній
     * @return true якщо стек порожній
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Перевірка, чи стек повний
     * @return true якщо стек повний
     */
    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }

    /**
     * Додає елемент до вершини стеку
     * @param item елемент, який додається
     * @throws StackOverflowException якщо стек повний
     */
    @Override
    public void push(E item) {
        if (isFull()) {
            // 🔥 Кидаємо виняток, якщо стек заповнений
            throw new StackOverflowException("Стек переповнений. Неможливо додати: " + item);
        }
        elements[++top] = item; // 🔹 Додаємо елемент до вершини стеку
    }

    /**
     * Видаляє та повертає верхній елемент
     * @return елемент з вершини стеку
     * @throws StackUnderflowException якщо стек порожній
     */
    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) {
            // 🔥 Кидаємо виняток, якщо стек порожній
            throw new StackUnderflowException("Стек порожній. Немає елементів для видалення.");
        }
        return (E) elements[top--]; // 🔹 Повертаємо верхній елемент і зменшуємо top
    }

    /**
     * Повертає верхній елемент без видалення
     * @return елемент з вершини стеку або null, якщо порожній
     */
    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            System.out.println("⚠️ Стек порожній. Немає елементів для перегляду.");
            return null;
        }
        return (E) elements[top]; // 🔹 Повертаємо елемент без змін
    }
}
