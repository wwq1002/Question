package 剑指offer;

public class 字符串转整数 {
    public int StrToInt(String str) {
        int i=0;
        int sum=0;
        int flag=1;
        if (str.length()==0||str==null)return 0;
        if (str.length()==1&&(str.charAt(0)=='-'||str.charAt(0)=='+'))return 0;
        if (str.charAt(0)=='+')i++;
        if (str.charAt(0)=='-'){
            i++;
            flag=-1;
        }
        for (int j = 0; j < str.length(); j++) {
             if (str.charAt(j)>'9'||str.charAt(j)<'0'){
                 return 0;
             }
             else{
                 sum=(sum*10)+str.charAt(j)-'0';
            }

        }
        return flag*sum;
    }
}
