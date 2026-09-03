import java.util.Arrays;
public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1,s2);

    }
}
