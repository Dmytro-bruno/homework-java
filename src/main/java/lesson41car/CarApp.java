package lesson41car;

import java.util.*;

/**
 * Демонстрація сортування автомобілів.
 */
public class CarApp {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car(2018, 2.0),
                new Car(2020, 1.6),
                new Car(2015, 3.2),
                new Car(2010, 1.2),
                new Car(2018, 1.8)
        );

        // Сортування за роком виробництва (від найстарішого до найновішого)
        cars.sort(Comparator.comparingInt(car -> car.yearOfManufacture));

        System.out.println("📋 Список автомобілів за роком випуску:");
        cars.forEach(System.out::println);

        // TreeSet з сортуванням за обсягом двигуна (за зростанням)
        TreeSet<Car> sortedByEngine = new TreeSet<>(Comparator.comparingDouble(car -> car.engineCapacity));
        sortedByEngine.addAll(cars);

        System.out.println("\n🌲 TreeSet за обсягом двигуна:");
        sortedByEngine.forEach(System.out::println);
    }
}
