public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println("5 => " + NextPrime.nextPrime(3));
        System.out.println("7 => " + NextPrime.nextPrime(5));
        System.out.println("5 => " + NextPrime.nextPrime(4));
        System.out.println("11 => " + NextPrime.nextPrime(8));
        System.out.println("2 => " + NextPrime.nextPrime(0));
        System.out.println("2 => " + NextPrime.nextPrime(1));
        System.out.println("31 => " + NextPrime.nextPrime(29));
        System.out.println("2 => " + NextPrime.nextPrime(-5));
    }
}