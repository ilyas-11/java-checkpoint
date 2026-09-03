public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step==0){
            return 0;
        }
        int a=0;
        int b=0;
        if (step>0) {
            for (int i =start ;i<=end;i+=step){
                a+=i;
                b++;
            }
        }else{
            for (int i =start ;i>=end;i+=step){
                a+=i;
                b++;
            }
        }
        if (b==0){
            return 0;
        }
        return a/b;
    }
}
