package lesson42students;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Демонстрація роботи зі списком студентів і Stream API.
 */
public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Andriy", 19, 4.5),
                new Student("Iryna", 22, 3.9),
                new Student("Olena", 21, 5.0),
                new Student("Taras", 20, 3.7),
                new Student("Nazar", 23, 4.2)
        );

        // 1. Студенти з оцінкою < 4.0
        System.out.println("🔍 Студенти з оцінкою < 4.0:");
        students.stream()
                .filter(s -> s.getGrade() < 4.0)
                .forEach(System.out::println);

        // 2. Студент з найвищою оцінкою
        System.out.println("\n🏆 Студент з найвищою оцінкою:");
        students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .ifPresent(System.out::println);

        // 3. Кількість студентів старших за 20
        long count = students.stream()
                .filter(s -> s.getAge() > 20)
                .count();
        System.out.println("\n📊 Студентів старших за 20: " + count);

        // 4. Імена студентів, відсортовані за оцінкою (↓)
        System.out.println("\n📚 Імена студентів за спаданням оцінки:");
        List<String> sortedNames = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);

        // 5. Чи є студент з оцінкою 5.0?
        boolean hasPerfect = students.stream()
                .anyMatch(s -> s.getGrade() == 5.0);
        System.out.println("\n✅ Є студент з оцінкою 5.0? " + hasPerfect);

        // 6. Імена студентів з оцінкою > 4.0
        System.out.println("\n🎯 Студенти з оцінкою > 4.0:");
        students.stream()
                .filter(s -> s.getGrade() > 4.0)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
