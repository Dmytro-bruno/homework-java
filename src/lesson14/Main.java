package lesson14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dragonCount = 0;
        boolean validInput = false;


        while (!validInput) {
            try {
                System.out.print("Скільки драконів створити? ");
                dragonCount = scanner.nextInt();
                scanner.nextLine();

                if (dragonCount > 0) validInput = true;
                else System.out.println("Введіть число більше 0!");
            } catch (InputMismatchException e) {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
            }
        }

        Dragon[] dragons = new Dragon[dragonCount];  // Масив для збереження драконів

        // Цикл для створення драконів
        for (int i = 0; i < dragonCount; i++) {
            System.out.println("\nВведіть дані для дракона #" + (i + 1));  // Виводимо порядковий номер дракона

            System.out.print("Ім'я: ");
            String name = scanner.nextLine();  // Зчитуємо ім'я дракона

            int age = 0;  // Змінна для віку дракона
            while (true) {  // Цикл для перевірки правильності введення
                try {
                    System.out.print("Вік: ");
                    age = scanner.nextInt();  // Введення віку дракона
                    scanner.nextLine();  // Очищаємо буфер введення
                    if (age > 0) break;  // Якщо введено правильний вік, виходимо з циклу
                    else System.out.println("Вік повинен бути більше 0!");  // Якщо введене число <= 0, просимо ввести ще раз
                } catch (InputMismatchException e) {  // Якщо введено некоректні дані (текст або символи)
                    System.out.println("Помилка! Введіть ціле число.");
                    scanner.nextLine();  // Очищаємо буфер введення
                }
            }

            double weight = 0;  // Змінна для ваги дракона
            while (true) {  // Цикл для перевірки правильності введення
                try {
                    System.out.print("Вага: ");
                    weight = scanner.nextDouble();  // Введення ваги дракона
                    scanner.nextLine();  // Очищаємо буфер введення
                    if (weight > 0) break;  // Якщо введено правильне число, виходимо з циклу
                    else System.out.println("Вага повинна бути більше 0!");  // Якщо введено <= 0, просимо ввести ще раз
                } catch (InputMismatchException e) {  // Якщо введено некоректні дані
                    System.out.println("Помилка! Введіть число (наприклад, 45.5).");
                    scanner.nextLine();  // Очищаємо буфер введення
                }
            }

            // Масив кольорів, які може вибрати користувач
            String[] colors = {"Червоний", "Зелений", "Синій"};

            int colorChoice = 0;  // Змінна для збереження вибору користувача

// Цикл, який працює, поки користувач не введе правильне число (1, 2 або 3)
            while (true) {
                // Виводимо меню для вибору кольору
                System.out.println("Оберіть колір луски:");
                System.out.println("1 - Червоний 🔴");
                System.out.println("2 - Зелений 🟢");
                System.out.println("3 - Синій 🔵");
                System.out.print("Ваш вибір: ");

                try {
                    colorChoice = scanner.nextInt();  // Користувач вводить число
                    scanner.nextLine();  // Очищаємо буфер введення після `nextInt()`

                    if (colorChoice >= 1 && colorChoice <= 3) break;  // Якщо число в межах 1-3, виходимо з циклу
                    else System.out.println("Помилка! Виберіть число від 1 до 3.");  // Якщо число не 1-3, просимо повторити
                } catch (InputMismatchException e) {
                    System.out.println("Помилка! Виберіть число від 1 до 3.");  // Якщо ввели не число (наприклад, текст), просимо повторити
                    scanner.nextLine();  // Очищаємо буфер після помилки
                }
            }

// Отримуємо колір із масиву `colors` за вибраним номером
            String scaleColor = colors[colorChoice - 1];

            dragons[i] = new Dragon(name, age, weight, scaleColor);  // Створюємо нового дракона і зберігаємо в масиві
        }

        // Виводимо інформацію про всіх створених драконів
        System.out.println("\n🔥 Інформація про створених драконів 🔥");  // Виводимо заголовок
        for (Dragon dragon : dragons) {  // Цикл для перебору всіх створених драконів
            System.out.println(dragon);  // Автоматично викликає метод toString() для кожного дракона
            System.out.println("ІМТ: " + DragonBMI.calculateBMI(dragon.getWeight(), dragon.getAge()));  // Обчислюємо ІМТ дракона
            dragon.speak();  // Викликаємо метод, щоб дракон щось сказав
        }
        // Додаємо можливість завершити програму або створити нових драконів
        while (true) {
            System.out.println("\n📌 Оберіть дію:");
            System.out.println("1 - Вийти з програми ❌");
            System.out.println("2 - Створити ще дракона 🐉");
            System.out.print("Ваш вибір: ");

            try {
                int choice = scanner.nextInt();  // Зчитуємо вибір користувача
                scanner.nextLine();  // Очищаємо буфер після введення числа

                if (choice == 1) {  // Якщо користувач вибрав вихід
                    System.out.println("\n😢 Дракончики кажуть: ");
                    for (Dragon dragon : dragons) {
                        dragon.sayGoodbye();  // Дракони прощаються
                    }
                    System.out.println("\nПрограма завершена.");
                    break;  // Вихід з циклу → завершення програми
                } else if (choice == 2) {  // Якщо користувач хоче створити ще дракона
                    main(args);  // Перезапускаємо програму
                    return;  // Вихід із поточного виконання
                } else {
                    System.out.println("Помилка! Введіть 1 або 2.");  // Якщо введено не 1 і не 2
                }
            } catch (InputMismatchException e) {  // Ловимо помилки, якщо введено текст або інші символи
                System.out.println("Помилка! Введіть число 1 або 2.");
                scanner.nextLine();  // Очищаємо буфер, щоб уникнути нескінченного циклу
            }
        }
        scanner.close();  // Закриваємо Scanner після використання
    }
}
