public class Factorial {
    public static Integer factorial(Integer n) {
        int res= 1;
        for (int i = 1;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
