package ArraysAndStrings;

public class StringCompression {
    public String stringCompression(String str){
        if (null == str) {
            throw new IllegalArgumentException("String can not be null");
        }
        if (str.length()==0) return str;
        StringBuilder newString = new StringBuilder();
        char prevChar=' ';
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!=prevChar){
                if (count>0){
                    newString.append(prevChar);
                    newString.append(count);
                }
                count=1;
                prevChar=str.charAt(i);
            }else{
                count++;
            }
        }
        if (count>0){
            newString.append(prevChar);
            newString.append(count);
        }
        if (newString.length()<str.length()) return newString.toString();
        return str;
    }
}
