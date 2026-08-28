public class SortArray {
    public static Integer[] sort(Integer[] arr) {
        int n= arr.length;
        for(int i =0;i<n;i++){
            for (int j =0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
    }
}
