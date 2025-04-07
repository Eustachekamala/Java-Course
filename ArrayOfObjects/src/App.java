public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Mustang", "Yellow");
        Car car2 = new Car("Corvette", "Red");
        Car car3 = new Car("Charger", "Green");

        Car[] cars = {car1, car2, car3};

        for(Car car :  cars){
            car.drive();
        }
    }
}
