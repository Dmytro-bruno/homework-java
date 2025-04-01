package lesson28geometry;

/**
 * Клас Circle — представляє геометричну фігуру "Коло"
 */
public class Circle extends Shape {
    private double radius; // Радіус кола

    /**
     * Конструктор, що приймає радіус
     * @param radius радіус кола
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Обчислює площу кола за формулою π * r^2
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Обчислює периметр (довжину кола) за формулою 2πr
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Виводить інформацію про фігуру
     */
    @Override
    public void displayInfo() {
        System.out.println("🔵 Фігура: Коло");
        System.out.println("Радіус: " + radius);
        System.out.printf("Площа: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }
}
