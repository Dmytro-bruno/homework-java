package lesson14;  // Визначаємо, що клас знаходиться в пакеті lesson14

import java.util.InputMismatchException;  // Імпортуємо клас для обробки помилок введення
import java.util.Scanner;  // Імпортуємо Scanner для введення даних з клавіатури

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Створюємо об'єкт Scanner для введення даних користувачем

        int dragonCount = 0;  // Змінна для збереження кількості драконів
        boolean validInput = false;  // Логічна змінна для перевірки коректності введення

        // Цикл, який повторюється, поки користувач не введе коректне число драконів
        while (!validInput) {
            try {
                System.out.print("Скільки драконів створити? ");  // Запитуємо кількість драконів
                dragonCount = scanner.nextInt();  // Зчитуємо введене число
                scanner.nextLine();  // Очищаємо буфер після введення числа (щоб уникнути помилок)

                if (dragonCount > 0) validInput = true;  // Якщо число більше 0, завершуємо цикл
                else System.out.println("Введіть число більше 0!");  // Якщо число 0 або менше, просимо ввести ще раз
            } catch (InputMismatchException e) {  // Якщо введено некоректні дані (наприклад, текст замість числа)
                System.out.println("Помилка! Введіть ціле число.");  // Виводимо повідомлення про помилку
                scanner.nextLine();  // Очищаємо буфер введення
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

            System.out.print("Колір луски: ");
            String scaleColor = scanner.nextLine();  // Введення кольору луски дракона

            dragons[i] = new Dragon(name, age, weight, scaleColor);  // Створюємо нового дракона і зберігаємо в масиві
        }

        // Виводимо інформацію про всіх створених драконів
        System.out.println("\n🔥 Інформація про створених драконів 🔥");
        for (Dragon dragon : dragons) {  // Перебираємо всіх драконів у масиві
            dragon.displayDragonInfo();  // Викликаємо метод для виведення інформації про дракона
            System.out.println("ІМТ: " + DragonBMI.calculateBMI(dragon.getWeight(), dragon.getAge()));  // Обчислюємо і виводимо ІМТ
            System.out.println("---------------------------");  // Додаємо роздільник між драконами
        }

        scanner.close();  // Закриваємо Scanner після використання
    }
}
