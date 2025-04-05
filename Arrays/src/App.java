import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] fruits = { "apple", "orange", "pinaple", "banana", "coconut"};

        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
