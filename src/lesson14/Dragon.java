package lesson14;  // Визначаємо, що клас знаходиться в пакеті lesson14

public class Dragon extends DragonAttributes {  // Клас Dragon успадковує DragonAttributes
    public Dragon() {
        super();  // Викликає конструктор без параметрів з батьківського класу
    }

    public Dragon(String name, int age, double weight, String scaleColor) {
        super(name, age, weight, scaleColor);  // Викликає конструктор з параметрами з батьківського класу
    }

    // Метод для виводу інформації про дракона
    public void displayDragonInfo() {
        System.out.println("Дракон " + getName() + " 🔥");  // Виводимо ім'я дракона зі смайликом вогню
        System.out.println("Вік: " + getAge() + " років");  // Вік дракона
        System.out.println("Вага: " + getWeight() + " кг");  // Вага дракона
        System.out.println("Колір луски: " + getScaleColor());  // Колір луски
    }

    // Метод, який змушує дракона щось сказати залежно від його BMI
    public void speak() {
        double bmi = DragonBMI.calculateBMI(getWeight(), getAge());  // Розраховуємо ІМТ дракона

        System.out.print(getName() + " каже: ");  // Дракон починає говорити

        if (bmi < 15) {
            System.out.println("Я голодний! 🔥");  // Якщо низький BMI
        } else if (bmi >= 15 && bmi <= 25) {
            System.out.println("Я у чудовій формі! 🐉");  // Якщо нормальний BMI
        } else {
            System.out.println("Я переїв! 🤰🔥");  // Якщо високий BMI
        }
    }
    // Метод, який викликається при завершенні програми
    public void sayGoodbye() {
        System.out.println(getName() + " каже: Прощавай, ми будемо сумувати... 😢🐉");
    }
}
