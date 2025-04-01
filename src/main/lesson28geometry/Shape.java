package lesson28geometry;

/**
 * Абстрактний клас Shape — базовий для всіх геометричних фігур
 */
public abstract class Shape {

    /**
     * Абстрактний метод для обчислення площі
     */
    public abstract double calculateArea(); // 🔹 метод, який обов’язково перевизначається

    /**
     * Абстрактний метод для обчислення периметра
     */
    public abstract double calculatePerimeter(); // 🔹 обов'язковий метод для фігур

    /**
     * Метод для виводу інформації про фігуру
     */
    public abstract void displayInfo(); // 🔹 кожна фігура має реалізувати своє відображення
}
