public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        int n =arr.length;
        Integer[] res =new Integer[n];
        for (int i=0; i<n;i++){
            res[i]=arr[n-1-i];
        }
        return res;
    }
}
