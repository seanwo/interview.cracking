package ArraysAndStrings;

public class OneAway {
    private boolean IsOneReplaceAway(String str1, String str2){
        int diffs = 0;
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i)!=str2.charAt(i)){
                diffs++;
            }
            if (diffs>1) return false;
        }
        return true;
    }

    private boolean IsOneDeleteAway(String smallStr, String largeStr){
        if (largeStr.length()-smallStr.length()>1) return false;
        int offset=0;
        for (int i=0; i<smallStr.length(); i++){
            if (smallStr.charAt(i)!=largeStr.charAt(i+offset)){
                offset++;
            }
            if (offset>1) return false;
        }
        return true;
    }

    public boolean IsOneEditAway(String str1, String str2){
        if ((null == str1) || (null == str2)){
            throw new IllegalArgumentException("parameters may not be null");
        }

        if (str1.length()==str2.length()){
            return IsOneReplaceAway(str1, str2);
        }else{
            if (str1.length()>str2.length()){
                return IsOneDeleteAway(str2, str1);
            }else{
                return IsOneDeleteAway(str1, str2);
            }
        }
    }
}
