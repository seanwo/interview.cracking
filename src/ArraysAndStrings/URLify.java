package ArraysAndStrings;

public class URLify {
    public char[] URLify(char[] str, int len){
        if (null==str) {
            throw new IllegalArgumentException("character array can not be null");
        }

        int spaces = 0;
        for (int i=0; i<len; i++){
            if (str[i]==' '){
                spaces++;
            }
        }

        int arrayLen = (len-spaces)+(spaces*3);

        int oldIndex = len-1;
        int newIndex = arrayLen-1;

        while (oldIndex>=0){
            if (str[oldIndex]!=' '){
                str[newIndex--]=str[oldIndex--];
            }else{
                str[newIndex--]='0';
                str[newIndex--]='2';
                str[newIndex--]='%';
                oldIndex--;
            }
        }

        return str;
    }
}
