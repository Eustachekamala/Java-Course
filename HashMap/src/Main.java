import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
         * HashMap = A data structure that stores key-value pairs
         * Key are unique, but Values can be duplicated
         * Does not maintain any order, but is memory efficient
         * HashMap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);


       /* if (map.containsKey("apple")){
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Key not found!");
        } */

        for (String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}