package lesson14;  // Визначаємо, що клас знаходиться в пакеті lesson14

import java.util.Scanner;  // Імпортуємо Scanner для введення даних

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Створюємо об'єкт Scanner для введення даних

        System.out.print("Скільки драконів створити? ");
        int dragonCount = scanner.nextInt();  // Зчитуємо кількість драконів
        scanner.nextLine();  // Очищаємо буфер

        Dragon[] dragons = new Dragon[dragonCount];  // Масив для збереження драконів

        // Створюємо драконів через цикл
        for (int i = 0; i < dragonCount; i++) {
            System.out.println("Введіть дані для дракона #" + (i + 1));

            System.out.print("Ім'я: ");
            String name = scanner.nextLine();  // Введення імені дракона

            System.out.print("Вік: ");
            int age = scanner.nextInt();  // Введення віку дракона

            System.out.print("Вага: ");
            double weight = scanner.nextDouble();  // Введення ваги дракона
            scanner.nextLine();  // Очищаємо буфер

            System.out.print("Колір луски: ");
            String scaleColor = scanner.nextLine();  // Введення кольору луски

            dragons[i] = new Dragon(name, age, weight, scaleColor);  // Створення дракона
        }

        // Вивід інформації про всіх драконів
        System.out.println("\n🔥 Інформація про створених драконів 🔥");
        for (Dragon dragon : dragons) {
            dragon.displayDragonInfo();
            System.out.println("ІМТ: " + DragonBMI.calculateBMI(dragon.getWeight(), dragon.getAge()));
            System.out.println("---------------------------");
        }

        scanner.close();  // Закриваємо Scanner
    }
}
