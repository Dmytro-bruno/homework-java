package lesson14;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private String shellColor;

    // Конструктор без параметрів
    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    // Конструктор з параметрами
    public Dragon(String name, int age, double weight, String shellColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.shellColor = shellColor;
        System.out.println("Створено повноцінного дракона: " + name);
    }
}