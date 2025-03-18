package lesson11;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayType("monday"));
        System.out.println(getDayType("SATURDAY"));
        System.out.println(getDayType("WEDNESDAY"));
    }

//    public static String getDayType(String day) {
//        return switch (day) {
//            case "SATURDAY", "SUNDAY" -> "Weekend";
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
//            default -> "Invalid day";
//        };
//    }
    public static String getDayType(String day) {
        String result = switch (day.toUpperCase()) {
            case "SATURDAY", "SUNDAY" -> "Weekend";
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            default -> "Invalid day";
        };
        return result;
    }
}
