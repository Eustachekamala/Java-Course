public class Main {
    public static void main(String[] args) {
        /*
         * The help protect object data and rules for accessing or modifying them.
         * GETTERS = Methods that make a field READABLE
         * SETTERS = Methods that maKE A field WRITEABLE
         */

        Car car = new Car("Ford", "Black", 5000);

        car.setColor("Yellow");
        car.setPrice(10000);

        System.out.println(car.getModel() +" "+ car.getColor() +" $"+ car.getPrice());
    }
}