public class ExerciseRunner {

    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        // =========================
        // Circle
        // =========================

        double radius = 5.0;
        double circleArea = calculator.calculate(radius);

        System.out.println(
            "Circle Area: expected = 78.54, actual = "
            + circleArea
        );


        // =========================
        // Rectangle
        // =========================

        double width = 4.0;
        double height = 6.0;
        double rectangleArea = calculator.calculate(width, height);

        System.out.println(
            "Rectangle Area: expected = 24.0, actual = "
            + rectangleArea
        );


        // =========================
        // Triangle
        // =========================

        double base = 4.0;
        double triangleHeight = 6.0;
        double triangleArea =
            calculator.calculate(base, triangleHeight, true);

        System.out.println(
            "Triangle Area: expected = 12.0, actual = "
            + triangleArea
        );


        // =========================
        // Square
        // =========================

        double side = 4.0;
        double squareArea = calculator.calculate(side, true);

        System.out.println(
            "Square Area: expected = 16.0, actual = "
            + squareArea
        );
    }
}

