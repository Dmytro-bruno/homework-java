package lesson42students;

/**
 * Клас Student — модель студента з імʼям, віком та оцінкою.
 */
public class Student {
    private String name;   // Імʼя студента
    private int age;       // Вік
    private double grade;  // Середня оцінка

    // Конструктор
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Геттери
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }

    // toString для зручного виводу
    @Override
    public String toString() {
        return "👨‍🎓 " + name + " | вік: " + age + " | оцінка: " + grade;
    }
}
