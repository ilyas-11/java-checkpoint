
public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println("3 =>"+AverageCalc.average(1,5,1));//3
        System.out.println("5 =>"+AverageCalc.average(1, 10, 2));
        System.out.println("6 =>"+AverageCalc.average(10, 1, -2));
        System.out.println("1 =>"+AverageCalc.average(1, 1, 1));
        System.out.println("1 =>"+AverageCalc.average(1, 1, 2));
        System.out.println("1 =>"+AverageCalc.average(1, 2, 10));
        System.out.println("-6 =>"+AverageCalc.average(-10, -1, 2));
        System.out.println("-5 =>"+AverageCalc.average(-1, -10, -2));
        System.out.println("0 =>"+AverageCalc.average(1, 10, 0));

    }
    

}
