package lesson30stack;

import java.util.Scanner;

/**
 * Клас StackConsoleApp — дозволяє взаємодіяти зі стеком через консоль
 */
public class StackConsoleApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("📦 Консольна програма: Робота зі стеком");
        boolean running = true;

        while (running) {
            System.out.println("\nОберіть дію:");
            System.out.println("1. Додати елемент (push)");
            System.out.println("2. Дістати елемент (pop)");
            System.out.println("3. Подивитись верхній елемент (peek)");
            System.out.println("4. Вийти");

            System.out.print(">> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введіть елемент: ");
                    String input = scanner.nextLine();
                    stack.push(input);
                    break;
                case "2":
                    String popped = stack.pop();
                    if (popped != null) {
                        System.out.println("➡️ Дістали: " + popped);
                    }
                    break;
                case "3":
                    String peeked = stack.peek();
                    if (peeked != null) {
                        System.out.println("🔝 Верхній елемент: " + peeked);
                    }
                    break;
                case "4":
                    running = false;
                    System.out.println("👋 До зустрічі!");
                    break;
                default:
                    System.out.println("⚠️ Невірна опція. Спробуйте ще раз.");
            }
        }

        scanner.close();
    }
}
