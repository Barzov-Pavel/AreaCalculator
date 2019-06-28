public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else return radius * radius * Math.PI;
    }

    public static double area(double side1, double side2) {
        if (side1 < 0 || side2 < 0) {
            return -1.0;
        } else return side1 * side2;
    }
}
