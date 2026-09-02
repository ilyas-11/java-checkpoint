public class ExerciseRunner {

    public static void main(String[] args) {

        // ==================================
        // Iterative Factorial
        // ==================================

        Factorial iterative = new IterativeFactorial();

        System.out.println(
            "Iterative 0: expected = 1, actual = "
            + iterative.calculate(0)
        );

        System.out.println(
            "Iterative 1: expected = 1, actual = "
            + iterative.calculate(1)
        );

        System.out.println(
            "Iterative 5: expected = 120, actual = "
            + iterative.calculate(5)
        );

        System.out.println(
            "Iterative 10: expected = 3628800, actual = "
            + iterative.calculate(10)
        );


        // ==================================
        // Recursive Factorial
        // ==================================

        Factorial recursive = new RecursiveFactorial();

        System.out.println(
            "Recursive 0: expected = 1, actual = "
            + recursive.calculate(0)
        );

        System.out.println(
            "Recursive 1: expected = 1, actual = "
            + recursive.calculate(1)
        );

        System.out.println(
            "Recursive 5: expected = 120, actual = "
            + recursive.calculate(5)
        );

        System.out.println(
            "Recursive 10: expected = 3628800, actual = "
            + recursive.calculate(10)
        );


        // ==================================
        // Check Iterative
        // ==================================

        Factorial iterativeTest = new IterativeFactorial();

        try {
            iterativeTest.calculate(100000);

            System.out.println(
                "Iterative Check: PASS - no StackOverflowError"
            );

        } catch (StackOverflowError e) {

            System.out.println(
                "Iterative Check: FAIL - StackOverflowError"
            );
        }


        // ==================================
        // Check Recursive
        // ==================================

        Factorial recursiveTest = new RecursiveFactorial();

        try {
            recursiveTest.calculate(100000);

            System.out.println(
                "Recursive Check: FAIL - no StackOverflowError"
            );

        } catch (StackOverflowError e) {

            System.out.println(
                "Recursive Check: PASS - StackOverflowError detected"
            );
        }
    }
}

