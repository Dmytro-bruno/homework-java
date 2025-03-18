package lesson14;

public class DragonAttributes {
    private String name;
    private int age;
    private double weight;
    private String scaleColor;
    private DragonType type; // Додаємо тип дракона

    public DragonAttributes() {
        this.name = "Невідомий";
        this.age = 0;
        this.weight = 0.0;
        this.scaleColor = "Невідомий";
        this.type = DragonType.FIRE; // Тип за замовчуванням
    }

    public DragonAttributes(String name, int age, double weight, String scaleColor, DragonType type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scaleColor = scaleColor;
        this.type = type;
    }

    // Геттери та сеттери
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public String getScaleColor() { return scaleColor; }
    public DragonType getType() { return type; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }
    public void setType(DragonType type) { this.type = type; }
}
