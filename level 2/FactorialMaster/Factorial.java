public abstract class Factorial {
    public abstract long calculate(int n);
        
    
}

class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        long res= 1;
        for (int i=1;i<=n ;i++){
            res*=i;
        }
        return res;
    }
}

class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n==0){
            return 1;
        }
        return n*calculate(n-1);

    }
}
