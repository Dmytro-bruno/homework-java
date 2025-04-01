package lesson28geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для перевірки обчислення площі різних геометричних фігур
 */
public class ShapeAreaTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(10); // Радіус 10
        double expected = Math.PI * 100; // π * r^2 = π * 100
        assertEquals(expected, circle.calculateArea(), 0.0001, "Площа кола обчислена некоректно");
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 4); // 5 * 4 = 20
        assertEquals(20.0, rectangle.calculateArea(), 0.0001, "Площа прямокутника обчислена некоректно");
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(6); // 6 * 6 = 36
        assertEquals(36.0, square.calculateArea(), 0.0001, "Площа квадрата обчислена некоректно");
    }

    @Test
    public void testAbstractShapeArea() {
        Shape shape = new Shape(); // Абстрактна фігура — повертає 0
        assertEquals(0.0, shape.calculateArea(), "Абстрактна фігура повинна мати площу 0");
    }
}
