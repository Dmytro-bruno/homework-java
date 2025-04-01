package lesson28geometry;

/**
 * Абстрактний клас Shape — базовий для всіх геометричних фігур
 */
public class Shape {

    /**
     * Метод обчислення площі — заглушка для дочірніх класів
     */
    public double calculateArea() {
        System.out.println("Площа не визначена для абстрактної фігури.");
        return 0;
    }

    /**
     * Метод обчислення периметра — заглушка
     */
    public double calculatePerimeter() {
        System.out.println("Периметр не визначений для абстрактної фігури.");
        return 0;
    }

    /**
     * Метод для виводу інформації про фігуру
     */
    public void displayInfo() {
        System.out.println("Це абстрактна фігура. Немає конкретних параметрів.");
    }
}