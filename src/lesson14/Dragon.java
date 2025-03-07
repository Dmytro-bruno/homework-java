package lesson14;

public class Dragon {  // Оголошуємо публічний клас Dragon

    private String name;  // Поле для збереження імені дракона
    private int age;  // Поле для збереження віку дракона
    private double weight;  // Поле для збереження ваги дракона
    private String scaleColor;  // Поле для збереження кольору луски дракона

    // Конструктор без параметрів
    public Dragon() {
        System.out.println("Створено невідомого дракона"); // Виводимо повідомлення при створенні дракона
    }

    // Конструктор з параметрами
    public Dragon(String name, int age, double weight, String scaleColor) {
        this.name = name;  // Ініціалізуємо ім'я дракона
        this.age = age;  // Ініціалізуємо вік дракона
        this.weight = weight;  // Ініціалізуємо вагу дракона
        this.scaleColor = scaleColor;  // Ініціалізуємо колір луски дракона
        System.out.println("Створено повноцінного дракона: " + name);  // Виводимо повідомлення
    }

    // Геттери (методи для отримання значень полів)
    public String getName() { return name; }  // Отримуємо ім'я
    public int getAge() { return age; }  // Отримуємо вік
    public double getWeight() { return weight; }  // Отримуємо вагу
    public String getScaleColor() { return scaleColor; }  // Отримуємо колір луски

    // Сеттери (методи для зміни значень полів)
    public void setName(String name) { this.name = name; }  // Встановлюємо ім'я
    public void setAge(int age) { this.age = age; }  // Встановлюємо вік
    public void setWeight(double weight) { this.weight = weight; }  // Встановлюємо вагу
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }  // Встановлюємо колір луски
}
