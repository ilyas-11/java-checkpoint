import java.io.*;
import java.util.Arrays;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{})));
        System.out.println(Arrays.toString(SortArray.sort(new Integer[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5})));
    }
}
