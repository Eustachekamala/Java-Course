public class Rectangle extends Shape{

    double length;
    double height;

    Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    double area() {
        return length * height;
    }
}
