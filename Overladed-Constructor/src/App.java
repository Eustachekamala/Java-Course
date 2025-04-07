public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  Overloaded-Constructor: Allow a class to have 
         *  multiple construtors with different parameter lists.
         *  Enable onjects to be initialzed in various ways.
         */

        User user1 = new User("Eustache");
        User user2 = new User("Eustache", "eustache@gmail.com");
        User user3 = new User("Eustache", "eustache@gmail.com", 25);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println("***************************************");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println("***************************************");

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println("***************************************");

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println("***************************************");
    }
}
