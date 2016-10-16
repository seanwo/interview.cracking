package ArraysAndStrings;

import java.util.HashSet;

public class IsUnique {
    public boolean IsUnique(String str){
        if (null == str){
            throw new IllegalArgumentException("input parameter may not be null");
        }
        HashSet<Character> set = new HashSet<>();
        for (Character c:str.toCharArray()){
            if (set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
