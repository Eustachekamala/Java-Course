public class Main {
    public static void main(String[] args){
        /*
         * Super = refers to the parent class (subclass <- superclass)
         * Used in constructors and method overriding
         * Calls the parent constructor to initialize attributes.
         */

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.5);
        Employee employee = new Employee("Mark", "Jane", 2000);

        employee.showSalary();
        student.showGpa();
    }
}
