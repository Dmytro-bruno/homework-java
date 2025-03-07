package lesson14;  // Визначаємо пакет, в якому знаходиться клас

// Оголошуємо клас DragonProperties, який зберігатиме властивості дракона
public class DragonProperties {
    private String name;  // Поле для імені дракона
    private int age;  // Поле для віку дракона
    private double weight;  // Поле для ваги дракона
    private String shellColor;  // Поле для кольору панцира дракона

    // Конструктор без параметрів (викликається, якщо не передано жодних даних)
    public DragonProperties() {
        System.out.println("Створено властивості для невідомого дракона");
        // Виводить повідомлення при створенні об'єкта
    }

    // Конструктор із параметрами (викликається, коли ми передаємо значення)
    public DragonProperties(String name, int age, double weight, String shellColor) {
        this.name = name;  // Ініціалізуємо поле name
        this.age = age;  // Ініціалізуємо поле age
        this.weight = weight;  // Ініціалізуємо поле weight
        this.shellColor = shellColor;  // Ініціалізуємо поле shellColor
    }

    // Геттери (методи для отримання значень полів)
    public String getName() {
        return name;  // Повертає значення імені дракона
    }

    public int getAge() {
        return age;  // Повертає значення віку дракона
    }

    public double getWeight() {
        return weight;  // Повертає значення ваги дракона
    }

    public String getShellColor() {
        return shellColor;  // Повертає значення кольору панцира дракона
    }

    // Сеттери (методи для зміни значень полів)
    public void setName(String name) {
        this.name = name;  // Встановлює нове значення імені
    }

    public void setAge(int age) {
        this.age = age;  // Встановлює нове значення віку
    }

    public void setWeight(double weight) {
        this.weight = weight;  // Встановлює нове значення ваги
    }

    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;  // Встановлює нове значення кольору панцира
    }
}