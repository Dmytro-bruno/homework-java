package lesson28geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тести для перевірки обчислення периметрів геометричних фігур
 */
public class ShapePerimeterTest {

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(5); // Радіус 5
        double expected = 2 * Math.PI * 5; // 2πr
        assertEquals(expected, circle.calculatePerimeter(), 0.0001, "Периметр кола обчислено неправильно");
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(3, 7); // 2*(3+7) = 20
        assertEquals(20.0, rectangle.calculatePerimeter(), 0.0001, "Периметр прямокутника обчислено неправильно");
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square(4); // 4*4 = 16
        assertEquals(16.0, square.calculatePerimeter(), 0.0001, "Периметр квадрата обчислено неправильно");
    }

    @Test
    public void testAbstractShapePerimeter() {
        Shape shape = new Circle(0); // Circle з радіусом 0 — периметр 0
        assertEquals(0.0, shape.calculatePerimeter(), 0.0001, "Периметр має бути 0 для нульового радіуса");
    }
}
