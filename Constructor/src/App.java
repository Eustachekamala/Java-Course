public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Constructor = A special method to initialize objects.
         * You can pass arguments to a constructor and set up initial values.
         */

        Student student1 = new Student("Frank", 25, 3.6);
        Student student2 = new Student("Mark", 27, 3.2);

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
