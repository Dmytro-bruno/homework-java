package lesson28geometry;

import java.util.Scanner;

/**
 * Консольна програма для моделювання геометричних фігур
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("🔷 Оберіть фігуру:");
            System.out.println("1 - Коло");
            System.out.println("2 - Прямокутник");
            System.out.println("3 - Квадрат");
            System.out.println("0 - Вихід");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("👋 До побачення!");
                break;
            }

            Shape shape = null;

            switch (choice) {
                case 1 -> {
                    System.out.print("Введіть радіус кола: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                }
                case 2 -> {
                    System.out.print("Введіть ширину прямокутника: ");
                    double width = scanner.nextDouble();
                    System.out.print("Введіть висоту прямокутника: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                }
                case 3 -> {
                    System.out.print("Введіть довжину сторони квадрата: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                }
                default -> {
                    System.out.println("❗ Невірний вибір. Спробуйте ще раз.");
                }
            }

            if (shape != null) {
                System.out.println("📊 Результат:");
                shape.displayInfo();
                System.out.println("──────────────────────────────\n");
            }
        }

        scanner.close();
    }
}
