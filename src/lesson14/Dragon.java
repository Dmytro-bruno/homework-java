package lesson14;

public class Dragon extends DragonAttributes {
    public Dragon() {
        super();
    }

    public Dragon(String name, int age, double weight, String scaleColor, DragonType type) {
        super(name, age, weight, scaleColor, type);
    }

    @Override
    public String toString() {
        return "🐉 Дракон " + getName() + " (" + getType() + ") 🔥\n" +
                "Вік: " + getAge() + " років\n" +
                "Вага: " + getWeight() + " кг\n" +
                "Колір луски: " + getScaleColor() + "\n" +
                "---------------------------";
    }

    /**
     * Дракон вимовляє фразу, яка залежить від його BMI.
     */
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

    /**
     * Дракон прощається.
     */
    public void sayGoodbye() {
        System.out.println(getName() + " каже: Прощавай, ми будемо сумувати. 😢🐉");
    }
}
