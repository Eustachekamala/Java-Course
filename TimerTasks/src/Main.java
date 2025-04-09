import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        /*
         * Timer = Class that schedules tasks at specific times or periodically
         * Useful for: sending notifications, scheduled updates, repetitive actions.

         * TimerTask = Represents the tasks that will be executed by the Timer
         * You will extend the TimerTask class to define your task
         * Create a subclass of TimerTask and @Override nun()
         */

       Timer timer = new Timer();
       TimerTask task = new TimerTask() {
           int count = 5;
           @Override
           public void run() {
               System.out.println("Hello world");
               count--;
               if (count <= 0){
                   System.out.println("Time completed");
                   timer.cancel();
               }
           };
       };
       timer.schedule(task, 0, 1000);
    }
}