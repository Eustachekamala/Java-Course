
public class Telephone {
    public static void main(String[] args) {

        /**
         * An array where each element is an array
         * Useful for storing a matrix of data
         */

        char[][] telephone = {  {'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'} };

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
