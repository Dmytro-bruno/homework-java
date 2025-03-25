package lesson18;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт автомобіля
        Automobile car = new Automobile(0, 7.5, LocalDate.of(2025, 12, 1));

        // Виводимо інформацію про автомобіль
        System.out.println("Інформація про авто: " + car);

        // Перевіряємо, чи може автомобіль їхати
        System.out.println("Машина може їхати: " + car.canDrive());

        // Перевіряємо, чи дійсний техогляд
        System.out.println("Машина допущена до експлуатації: " + car.isInspectionValid());

        // Обчислюємо максимальну відстань, яку можна проїхати
        System.out.println("Максимальна відстань: " + car.calculateMaxDistance() + " км");
    }
}
