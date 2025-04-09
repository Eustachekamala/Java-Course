import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            Generics = A concept where you can write a class, interface, or method
                that is compatible with different data types.
                <T> type parameter (placeholder that gets replaced with a real type)
                <String> type argument (specifies the type)
         */

       Box<String> box = new Box<>();
       Product<String, Double> product = new Product<>();

       box.setItem("Banana");
        product.setItem("Mango", 12.5);
        System.out.println(box.getItem());
        System.out.println("The " + product.getItem() + " Coast $" + product.getPrice());

    }
}