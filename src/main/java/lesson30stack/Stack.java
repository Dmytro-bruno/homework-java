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
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Перевірка, чи стек повний
     */
    @Override
    public boolean isFull() {
        return top == elements.length - 1;
    }

    /**
     * Додає елемент до вершини стеку
     */
    @Override
    public void push(E item) {
        if (isFull()) {
            System.out.println("❗ Стек заповнений. Неможливо додати елемент: " + item);
            return;
        }
        elements[++top] = item; // 🔹 Збільшуємо top і додаємо елемент
    }

    /**
     * Видаляє та повертає верхній елемент
     */
    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) {
            System.out.println("⚠️ Стек порожній. Немає елементів для видалення.");
            return null;
        }
        return (E) elements[top--]; // 🔹 Повертаємо верхній і зменшуємо top
    }

    /**
     * Повертає верхній елемент без видалення
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
