public class HarmoniousFusion {
    public int[] merge(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;
        int[] res=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if (arr1[i]<=arr2[j]){
                res[k]=arr1[i];
                i++;
            }else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;

    }
}
