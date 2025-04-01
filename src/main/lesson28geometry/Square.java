package lesson28geometry;

/**
 * Клас Square — представляє фігуру "Квадрат", наслідує Rectangle
 */
public class Square extends Rectangle {

    private double side; // Сторона квадрата (зберігаємо окремо для displayInfo)

    /**
     * Конструктор, що приймає сторону квадрата
     * @param side довжина сторони квадрата
     */
    public Square(double side) {
        super(side, side); // Використовуємо конструктор Rectangle з однаковою шириною і висотою
        this.side = side;
    }

    /**
     * Перевизначений метод для виводу інформації про квадрат
     */
    @Override
    public void displayInfo() {
        System.out.println("🟦 Фігура: Квадрат");
        System.out.println("Сторона: " + side);
        System.out.printf("Площа: %.2f\n", calculateArea());
        System.out.printf("Периметр: %.2f\n", calculatePerimeter());
    }
}
