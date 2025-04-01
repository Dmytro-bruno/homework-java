package lesson28geometry;

/**
 * Клас Rectangle — представляє геометричну фігуру "Прямокутник"
 */
public class Rectangle extends Shape {
    private double width;  // Ширина прямокутника
    private double height; // Висота прямокутника

    /**
     * Конструктор, що приймає ширину та висоту
     * @param width ширина прямокутника
     * @param height висота прямокутника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Обчислює площу прямокутника: width * height
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Обчислює периметр прямокутника: 2*(width + height)
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    /**
     * Виводить інформацію про фігуру
     */
    @Override
    public void displayInfo() {
        System.out.println("▭ Фігура: Прямокутник");
        System.out.println("Ширина: " + width);
        System.out.println("Висота: " + height);
        System.out.printf("Площа: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }
}
