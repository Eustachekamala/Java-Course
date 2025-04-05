import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] fruits;
        int size;
        boolean isFound = false;
        String target;

        System.out.print("What number of fruits do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        fruits = new String[size];

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter the fruit name: ");
            fruits[i] = scanner.nextLine();
        }

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int j = 0; j < fruits.length; j++) {
            if (fruits[j].equals(target)) {
                System.out.println("Element found at index: " + j);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Element doesn't exit in the array");
        }

        scanner.close();
    }
}
