package ArraysAndStrings;

import java.util.HashMap;
import java.util.Iterator;

public class PalindromePermutation {
    public boolean isPalindromePermutation(String str){
        if (null==str){
            throw new IllegalArgumentException("parameter can not be null");
        }

        HashMap<Character, Integer> charFreq = new HashMap<>();
        for (Character c:str.toCharArray()){
            if (c==' ') continue;
            c=Character.toLowerCase(c);
            if ((c<'a') || (c>'z')){
                throw new IllegalArgumentException("parameter contains illegal characters");
            }
            int count = 1;
            if (charFreq.containsKey(c)){
                count+=charFreq.get(c);
            }
            charFreq.put(c,count);
        }

        int odd = 0;
        Iterator<Integer> it = charFreq.values().iterator();
        while (it.hasNext()){
            if (it.next()%2>0) odd++;
            if (odd>1) return false;
        }

        return true;
    }
}
