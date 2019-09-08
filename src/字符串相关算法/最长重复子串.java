package 字符串相关算法;

public class 最长重复子串 {
    public static String MaxLongSubString(String str) {
        int first = 0;
        int k = 0;
        int maxLen = 0;
        //相隔1,2,3,4.。。str.length()-1
        for (int i = 1; i < str.length(); i++)
            for (int j = 0; j < str.length() - i; j++) {
                if (str.charAt(j) == str.charAt(j+i)) k++;
                else k = 0;
                if (maxLen < k) {
                    maxLen = k;
                    first = j - k + 1;
                }
            }
        return str.substring(first, maxLen + first);
    }

    public static void main(String[] args) {
        System.out.println(MaxLongSubString("acdsehdacds"));
    }
}
