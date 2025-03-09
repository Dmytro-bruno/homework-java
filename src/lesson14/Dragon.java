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
        System.out.println("Дракон " + getName() + " 🔥");
        System.out.println("Вік: " + getAge() + " років");
        System.out.println("Вага: " + getWeight() + " кг");
        System.out.println("Колір луски: " + getScaleColor());
    }
}
