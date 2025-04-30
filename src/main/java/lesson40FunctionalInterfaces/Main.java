package lesson40FunctionalInterfaces;

/**
 * Демонстрація використання Predicate і Supplier.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("🔍 Чи є 7 простим числом? " + FunctionalExamples.isPrime.test(7));
        System.out.println("🔍 Чи є 8 простим числом? " + FunctionalExamples.isPrime.test(8));
        System.out.println("📅 Випадковий день тижня: " + FunctionalExamples.randomDayOfWeek.get());
        FunctionalExamples.printRange.accept(5); // Виведе числа від 0 до 5
        System.out.println("🔢 Округлення 3.7 → " + FunctionalExamples.roundDouble.apply(3.7));
        System.out.println("🔢 Округлення 2.3 → " + FunctionalExamples.roundDouble.apply(2.3));
    }

}
