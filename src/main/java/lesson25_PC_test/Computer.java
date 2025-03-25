package lesson25_PC_test;

import java.util.UUID;

// Клас Computer з описом полів
public class Computer {
    private int ram; // Кількість оперативної памʼяті в ГБ
    private int cores; // Кількість ядер
    private String name; // Назва компʼютера
    private UUID serialNumber; // Серійний номер
    private OperatingSystem os; // Операційна система

    // Конструктор з параметрами
    public Computer(int ram, int cores, String name, UUID serialNumber, OperatingSystem os) {
        this.ram = ram;
        this.cores = cores;
        this.name = name;
        this.serialNumber = serialNumber;
        this.os = os;
    }

    // Перевизначений метод toString
    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cores=" + cores +
                ", name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                ", os=" + os +
                '}';
    }

    // Геттери (опційно, якщо будеш використовувати їх у тестах)
    public String getName() {
        return name;
    }

    public UUID getSerialNumber() {
        return serialNumber;
    }
}