package lesson18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class AutomobileTest {

    @Test
    void testCanDrive() {
        // Тестуємо, чи може автомобіль їхати, якщо є паливо
        Automobile carWithFuel = new Automobile(10.0, 7.5, LocalDate.of(2025, 12, 1));
        assertTrue(carWithFuel.canDrive(), "Авто має їхати, якщо є паливо");

        // Тестуємо, що авто не може їхати без пального
        Automobile carWithoutFuel = new Automobile(0.0, 7.5, LocalDate.of(2025, 12, 1));
        assertFalse(carWithoutFuel.canDrive(), "Авто не має їхати без пального");
    }

    @Test
    void testIsInspectionValid() {
        // Техогляд ще дійсний
        Automobile carValidInspection = new Automobile(10.0, 7.5, LocalDate.now().plusDays(10));
        assertTrue(carValidInspection.isInspectionValid(), "Техогляд має бути дійсним");

        // Техогляд прострочений
        Automobile carExpiredInspection = new Automobile(10.0, 7.5, LocalDate.now().minusDays(1));
        assertFalse(carExpiredInspection.isInspectionValid(), "Техогляд має бути недійсним");
    }

    @Test
    void testCalculateMaxDistance() {
        // Розрахунок максимальної дистанції
        Automobile car = new Automobile(50.0, 10.0, LocalDate.of(2025, 12, 1));
        double expectedDistance = (50.0 / 10.0) * 100;
        assertEquals(expectedDistance, car.calculateMaxDistance(), "Неправильний розрахунок відстані");
    }
}

