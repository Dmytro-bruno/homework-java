package lesson14;  // Визначаємо, що клас знаходиться в пакеті lesson14

public class DragonAttributes {  // Оголошення публічного класу DragonAttributes
    private String name;  // Поле для збереження імені дракона
    private int age;  // Поле для збереження віку дракона
    private double weight;  // Поле для збереження ваги дракона
    private String scaleColor;  // Поле для збереження кольору луски дракона

    // Конструктор без параметрів
    public DragonAttributes() {
        System.out.println("Створено невідомого дракона");  // Вивід повідомлення при створенні об'єкта без параметрів
    }

    // Конструктор з параметрами для ініціалізації дракона з певними значеннями
    public DragonAttributes(String name, int age, double weight, String scaleColor) {
        this.name = name;  // Присвоюємо значення полю name
        this.age = age;  // Присвоюємо значення полю age
        this.weight = weight;  // Присвоюємо значення полю weight
        this.scaleColor = scaleColor;  // Присвоюємо значення полю scaleColor
        System.out.println("Створено повноцінного дракона");  // Повідомлення про створення дракона
    }

    // Геттери та сеттери
    public String getName() {
        return name;  // Повертає ім'я дракона
    }

    public void setName(String name) {
        this.name = name;  // Встановлює ім'я дракона
    }

    public int getAge() {
        return age;  // Повертає вік дракона
    }

    public void setAge(int age) {
        this.age = age;  // Встановлює вік дракона
    }

    public double getWeight() {
        return weight;  // Повертає вагу дракона
    }

    public void setWeight(double weight) {
        this.weight = weight;  // Встановлює вагу дракона
    }

    public String getScaleColor() {
        return scaleColor;  // Повертає колір луски дракона
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;  // Встановлює колір луски дракона
    }
}
