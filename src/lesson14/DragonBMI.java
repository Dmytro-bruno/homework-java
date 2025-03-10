package lesson14;

public class DragonBMI {
    public static double calculateBMI(double weight, int age) {
        if (age <= 0) {
            System.out.println("Некоректний вік");
            return 0;
        }
        return weight / (age * age);
    }
}
