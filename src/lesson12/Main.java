package lesson12;

import java.util.Scanner; // Імпортуємо клас Scanner для введення даних

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Це створюємо об'єкт Scanner

        // Тут зчитуємо розміри масиву від користувача
        System.out.print("Введіть кількість рядків (n): ");
        int n = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (m): ");
        int m = scanner.nextInt();
    }
}
