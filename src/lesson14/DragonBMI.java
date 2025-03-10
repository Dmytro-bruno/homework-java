package lesson14;  // Визначаємо, що клас знаходиться в пакеті lesson14

public class DragonBMI {  // Оголошення класу для розрахунку ІМТ
    public static double calculateBMI(double weight, int age) {
        if (age <= 0) {  // Перевірка, щоб уникнути ділення на нуль
            System.out.println("Некоректний вік");
            return 0;
        }
        return weight / (age * age);  // Формула для розрахунку ІМТ
    }
}
