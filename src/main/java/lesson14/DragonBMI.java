package lesson14;

public class DragonBMI {
    /**
     * Обчислює індекс маси тіла дракона.
     * @param weight Вага дракона.
     * @param age Вік дракона.
     * @return Значення BMI (індексу маси тіла).
     */
    public static double calculateBMI(double weight, int age) {
        if (age <= 0) {
            System.out.println(" Некоректний вік! BMI не може бути розрахований.");
            return 0;
        }
        return weight / (age * age);
    }
}
