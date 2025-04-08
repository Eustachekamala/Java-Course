public class Main {
    public static void main(String[] args) {
        /*
         * Aggregation = Represents a "has-a" Relationship between objects.
         * One object contains another object as part of its structure, but
         * the contained object/s can exist independently
         */

        Book book1 = new Book("- The Follow of the Ring", 453);
        Book book2 = new Book("- The Two Towers", 343);
        Book book3 = new Book("- The Return of the King", 252);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

    }
}