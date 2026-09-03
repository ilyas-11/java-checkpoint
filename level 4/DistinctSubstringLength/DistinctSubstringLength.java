public class DistinctSubstringLength {
    public int maxLength(String s) {
        int max=0;
        for (int i=0;i<s.length();i++){
            String c="";
             for (int j = i;j<s.length();j++){
                String ch=String.valueOf(s.charAt(j));
                if(c.contains(ch)){
                    break;
                }
                c+=ch;
                if(c.length()>max){
                    max=c.length();
                }
             }
        }
        return max;
    }
}
