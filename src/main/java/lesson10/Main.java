package lesson10;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {66, 22, 33, 44, 55, 69, 77, 88, 105}; // Масив чисел

        System.out.println("Всі числа масиву:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Парні числа масиву:");
        for (int num : numbers) {
            if (num % 2 == 0) { // Якщо число парне
                System.out.print(num + " ");
            }
        }
    }
}