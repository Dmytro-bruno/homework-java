package lesson18;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@Getter // Генерує геттери для всіх полів
@Setter // Генерує сеттери для всіх полів
@AllArgsConstructor // Створює конструктор з усіма аргументами
@NoArgsConstructor // Створює конструктор без аргументів
@ToString // Додає метод toString()
public class Automobile {
    private double gasolineLevel; // Поточний рівень пального (літри)
    private double gasolineLevel100km; // Витрата пального на 100 км (літри)
    private LocalDate inspectionDate; // Дата наступного техогляду

    // Метод перевіряє, чи машина може їхати (чи є пальне)
    public boolean canDrive() {
        return gasolineLevel > 0;
    }

    // Метод перевіряє, чи дійсний техогляд (чи ще не прострочений)
    public boolean isInspectionValid() {
        return LocalDate.now().isBefore(inspectionDate);
    }

    // Метод розраховує максимальну відстань, яку може проїхати авто
    public double calculateMaxDistance() {
        return (gasolineLevel / gasolineLevel100km) * 100;
    }
}
