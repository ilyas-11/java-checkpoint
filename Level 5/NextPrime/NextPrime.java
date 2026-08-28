public class NextPrime {
    public static Integer nextPrime(Integer n) {
        if (n<2){
            return 2;
        }
        int x=n+1;
        
        while(!isPrime(x)){
            x++;
        }
        return x;
    }
    public static boolean isPrime(Integer n){
        if (n<1){
            return false;
        }
        if (n==2){
            return true;
        }
        if (n%2==0){
            return false;
        }
        for (int i =3;i*i<=n;i+=2){
            if (n%i==0 ){
                return false;
            }
        }
        return true;

    }
}
