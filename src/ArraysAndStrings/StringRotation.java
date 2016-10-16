package ArraysAndStrings;

public class StringRotation {

    private boolean isSubstring(String str, String subStr){
        return str.contains(subStr);
    }

    public boolean IsStringRotation(String str, String rotation){
        if ((null==str) || (null==rotation)){
            throw new IllegalArgumentException("parameters can not be null");
        }

        if (str.length()!=rotation.length()) return false;
        if (str.length()<=1) return true;

        String concat = rotation+rotation;
        return isSubstring(concat, str);
    }
}
