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

        // Створюємо двовимірний масив
        int[][] numbers = new int[n][m];

        // Заповнюємо масив даними користувача
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) { // Тут перебираємо рядки
            for (int j = 0; j < m; j++) { // Тут перебираємо стовпці
                numbers[i][j] = scanner.nextInt(); // Зчитуємо елемент у масив
            }
        }

    }
}
