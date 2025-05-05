package lesson41car;

import java.util.Objects;

/**
 * Клас Car — модель автомобіля з роком випуску та об'ємом двигуна.
 */
public class Car {
    public int yearOfManufacture;     // Рік виробництва
    public double engineCapacity;     // Обсяг двигуна в літрах

    /**
     * Конструктор для ініціалізації Car.
     */
    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "🚗 Car{" +
                "year=" + yearOfManufacture +
                ", engine=" + engineCapacity +
                '}';
    }

    // equals/hashCode для TreeSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return yearOfManufacture == car.yearOfManufacture &&
                Double.compare(car.engineCapacity, engineCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfManufacture, engineCapacity);
    }
}
