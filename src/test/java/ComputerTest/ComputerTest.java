package ComputerTest;

import lesson25_PC_test.Computer;
import lesson25_PC_test.OperatingSystem;
import org.junit.jupiter.api.Test; // ✅ Імпорт анотації @Test з JUnit 5
import java.util.UUID; // ✅ Імпорт для генерації UUID

import static org.junit.jupiter.api.Assertions.assertTrue; // ✅ Імпорт assertTrue


public class ComputerTest {

    @Test
    void testToStringContainsFields() {
        // Створюємо UUID
        UUID serial = UUID.randomUUID();

        // Створюємо компʼютер
        Computer pc = new Computer(16, 8, "Lenovo", serial, OperatingSystem.WINDOWS);

        // Отримуємо рядок toString
        String description = pc.toString();

        // Перевіряємо, що всі значення входять у toString
        assertTrue(description.contains("Lenovo"));
        assertTrue(description.contains("16"));
        assertTrue(description.contains("8"));
        assertTrue(description.contains(serial.toString()));
        assertTrue(description.contains("WINDOWS"));
    }
}