package polymorphisim;

public class Area {

    public static double area(double length, double width) {
        return (length * width);

    }
    public static double area(float base, double height) {
        return (.5*(base * height));
    }
    public static double area(double radius) {
        return Math.PI *(radius * radius);
    }
    public static double area(float side) {
        return (side * side);
    }
}