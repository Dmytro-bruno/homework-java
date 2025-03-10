package lesson14;

public class DragonAttributes {
    private String name;
    private int age;
    private double weight;
    private String scaleColor;

    public DragonAttributes() {
        System.out.println("Створено невідомого дракона");
    }

    public DragonAttributes(String name, int age, double weight, String scaleColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scaleColor = scaleColor;
        System.out.println("Створено повноцінного дракона");
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
