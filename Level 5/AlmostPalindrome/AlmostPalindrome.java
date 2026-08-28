public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (s == null || s.length() < 3) {
            return false;
        }
        s=s.toLowerCase();
        int l=0;
        int r = s.length()-1;
        while(l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s, l+1, r)||isPalindrome(s, l, r-1);
            }
            l++;
            r--;
        }
        return false;
    }
    public static boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;

            }
            l++;
            r--;
        }
        return true;
    }

}