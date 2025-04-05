public class Varargs {
    public static void main(String[] args) throws Exception {

        /*
         * varargs = allow a method to accept a varying # of arguments
         * makes methods more flexible, no need for overloaded methods
         * java will pack the arguments into an array ...(ellipsis)
         */
       System.out.printf("You got: %.2f%%",  average(60, 76, 49, 72, 65.8, 86));
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
