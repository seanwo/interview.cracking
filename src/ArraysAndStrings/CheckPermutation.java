package ArraysAndStrings;

import java.util.HashMap;

public class CheckPermutation {
    public boolean isPermutation(String str1, String str2){
        if ((null == str1) || (null== str2)){
            throw new IllegalArgumentException("neither parameter may be null");
        }
        if (str1.length()!=str2.length()) return false;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for (Character c: str1.toCharArray()){
            int count=1;
            if (charFreq.containsKey(c)){
                count+=charFreq.get(c);
            }
            charFreq.put(c, count);
        }
        for (Character c:str2.toCharArray()){
            if (!charFreq.containsKey(c)){
                return false;
            }
            int count = charFreq.get(c);
            count--;
            if (count == 0){
                charFreq.remove(c);
            }else{
                charFreq.put(c,count);
            }
        }
        return true;
    }
}
