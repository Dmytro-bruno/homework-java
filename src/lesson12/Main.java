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
        while (true) { // Нескінченний цикл для меню
            System.out.println("Меню:");
            System.out.println("1 - Відобразити всі парні елементи");
            System.out.println("2 - Порахувати суму елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("69 - Завершити програму");
            System.out.print("Виберіть опцію: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Парні елементи масиву:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (numbers[i][j] % 2 == 0) { // Якщо число парне
                                System.out.print(numbers[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            sum += numbers[i][j]; // Додаємо кожен елемент до суми
                        }
                    }
                    System.out.println("Сума всіх елементів: " + sum);
                    break;

                case 3:
                    int max = numbers[0][0]; // Починаємо з першого елемента
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (numbers[i][j] > max) { // Якщо знайшли більше число
                                max = numbers[i][j];
                            }
                        }
                    }
                    System.out.println("Найбільший елемент у масиві: " + max);
                    break;

                case 69:
                    System.out.println("Програма завершена.");
                    scanner.close(); // Закриваємо Scanner
                    return; // Вихід з програми

            }
        }

    }
}
