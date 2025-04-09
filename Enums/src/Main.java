import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Enums = (Enumeration) A special kind of class that represents
         * a fixed set of constants. They improve code readability and are
         * easy to maintain. More efficient with switches when comparing
         * strings.
         */
        System.out.print("Enter a day of a week: ");
        try(Scanner scanner = new Scanner(System.in)) {
            String response = scanner.nextLine().toUpperCase();
            Day day = Day.valueOf(response);
            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend");
                default -> System.out.println("Nothing");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Please a valid day");
        }
    }
}