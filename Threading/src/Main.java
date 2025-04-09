import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Threading = Allows a program to run multiple tasks simultaneously
         * helps improve performance with time-consuming operations
         * (File I/0, network communication, or any background tasks)

         * How to create a Thread
         * Option 1. Extend the thread class (simpler)
         * Option 2. Implement the Runnable interface (better)
         */

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("You have 10 second to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
        scanner.close();
    }
}