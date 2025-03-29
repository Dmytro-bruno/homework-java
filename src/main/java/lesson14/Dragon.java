package lesson14;

import java.util.Objects; // Імпортуємо клас для генерації hashCode

public class Dragon extends DragonAttributes {
    public Dragon() {
        super();
    }

    public Dragon(String name, int age, double weight, String scaleColor, DragonType type) {
        super(name, age, weight, scaleColor, type);
    }

    @Override
    public String toString() {
        double bmi = DragonBMI.calculateBMI(getWeight(), getAge()); // Розрахунок BMI
        return "🐉 Дракон " + getName() + " (" + getType() + ") 🔥\n" +
                "Вік: " + getAge() + " років\n" +
                "Вага: " + getWeight() + " кг\n" +
                "Колір луски: " + getScaleColor() + "\n" +
                "Індекс маси тіла (BMI): " + String.format("%.2f", bmi) + "\n" + // Додаємо BMI
                "---------------------------";
    }

    public void speak() {
        double bmi = DragonBMI.calculateBMI(getWeight(), getAge());

        System.out.print(getName() + " каже: ");

        if (bmi < 15) {
            System.out.println("Я голодний! 🔥");
        } else if (bmi >= 15 && bmi <= 25) {
            System.out.println("Я у чудовій формі! 🐉");
        } else {
            System.out.println("Я переїв! 🤰🔥");
        }
    }

    public void sayGoodbye() {
        System.out.println(getName() + " каже: Прощавай, ми будемо сумувати. 😢🐉");
    }

    @Override
    public boolean equals(Object o) {
        // Перевірка на однакове посилання
        if (this == o) return true;

        // Перевірка типу та null
        if (o == null || getClass() != o.getClass()) return false;

        // Приведення типу
        Dragon dragon = (Dragon) o;

        // Порівнюємо всі важливі поля
        return getAge() == dragon.getAge() && // Порівнюємо вік
                Double.compare(getWeight(), dragon.getWeight()) == 0 && // Порівнюємо вагу
                getName().equals(dragon.getName()) && // Порівнюємо ім’я
                getScaleColor().equals(dragon.getScaleColor()) && // Порівнюємо колір луски
                getType() == dragon.getType(); // Порівнюємо тип дракона
    }

    @Override
    public int hashCode() {
        // Генеруємо hashCode на основі тих же полів, що в equals()
        return Objects.hash(getName(), getAge(), getWeight(), getScaleColor(), getType());
    }
}
