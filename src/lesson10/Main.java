package lesson10;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {11, 22, 33, 44, 55, 69, 77}; // Масив чисел

        System.out.println("Всі числа масиву:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}