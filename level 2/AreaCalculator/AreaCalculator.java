import java.lang.Math;

public class AreaCalculator {
    public double calculate(double radius) {
        return Math.round(Math.PI*radius*radius*100.0)/100.0;
    }

    public double calculate(double width, double height) {
        return width*height;
    }

    public double calculate(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public double calculate(double side, boolean isSquare) {
        return side * side;
    }
}
