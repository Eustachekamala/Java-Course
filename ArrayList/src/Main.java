import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * ArrayList = A resizeable array that stores objects (autoboxing).
         * Arrays are fixed in size, but ArrayLists can change.
         */
/*
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Pineapple");
        fruits.add("Coconut");
        fruits.add("Banana");
        fruits.add("Apple");

        Collections.sort(fruits);
        System.out.println(fruits);
*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food that you would like: ");
        int numOfFood = scanner.nextInt();
        if(numOfFood < 0){
            System.out.println("Quantity can't be 0 or empty");
        }
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++){
            System.out.print("Enter the food #" + i + ": ");
            foods.add(scanner.nextLine());
        }
        System.out.println("You make an other of: " + foods);
        scanner.close();

    }
}