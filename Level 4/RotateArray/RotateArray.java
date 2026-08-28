public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rot) {
        int n =arr.length;
        if (n==0){
            return arr;
        }
        Integer[] res= new Integer[n];
        rot = rot %n;
        for (int i =0 ;i<n ;i++){
            int ni=(i+rot )%n;
            if (ni<0){
                ni+=n;
            }
            res[ni]=arr[i];
        }

        return res;

    }
}
