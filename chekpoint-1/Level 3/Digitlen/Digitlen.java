public class Digitlen {
    public static int digitlen(long number) {
       int c =0;
       do {
        number/=10;
        c++;
       }while(number!=0);
       return c;
    }
}
