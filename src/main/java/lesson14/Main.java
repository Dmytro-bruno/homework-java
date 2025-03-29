package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Скільки драконів створити? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        Dragon[] dragons = new Dragon[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Введіть ім'я дракона: ");
            String name = scanner.nextLine();

            System.out.print("Вік: ");
            int age = scanner.nextInt();

            System.out.print("Вага: ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            System.out.print("Колір луски: ");
            String scaleColor = scanner.nextLine();

            System.out.println("Оберіть тип дракона:");
            for (DragonType type : DragonType.values()) {
                System.out.println(type.ordinal() + 1 + " - " + type);
            }

            int typeChoice;
            DragonType chosenType;
            while (true) {
                System.out.print("Ваш вибір (1-" + DragonType.values().length + "): ");
                typeChoice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
                if (typeChoice >= 1 && typeChoice <= DragonType.values().length) {
                    chosenType = DragonType.values()[typeChoice - 1];
                    break;
                } else {
                    System.out.println("Невірний вибір! Спробуйте ще раз.");
                }
            }

            dragons[i] = new Dragon(name, age, weight, scaleColor, chosenType);
        }

        System.out.println("\n🔹 Створені дракони 🔹");
        for (Dragon dragon : dragons) {
            System.out.println(dragon);
            dragon.speak();
            System.out.println(dragon.getName() + ": Мій індекс маси тіла - " +
                    String.format("%.2f", DragonBMI.calculateBMI(dragon.getWeight(), dragon.getAge())) + " 🏋️‍♂️\n");
        }
// ✅ Перевірка equals() та hashCode()
        System.out.println("🔍 Перевірка equals() і hashCode():");

        if (count >= 2) {
            Dragon dragon1 = dragons[0]; // Перший дракон
            Dragon dragon2 = dragons[1]; // Другий дракон

            // Перевіряємо, чи об'єкти рівні
            boolean areEqual = dragon1.equals(dragon2);

            // Перевіряємо, чи хеш-коди збігаються
            boolean sameHash = dragon1.hashCode() == dragon2.hashCode();

            // 🔎 Результати
            System.out.println("Чи dragon1 дорівнює dragon2? → " + (areEqual ? "✅ Так" : "❌ Ні"));
            System.out.println("Чи збігаються їхні hashCode()? → " + (sameHash ? "✅ Так" : "❌ Ні"));
        } else {
            System.out.println("❗ Створіть принаймні 2 дракони для порівняння.");
        }

        scanner.close();
    }
}
