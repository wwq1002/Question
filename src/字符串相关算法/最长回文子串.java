package 字符串相关算法;

import java.sql.Array;
import java.util.Arrays;

public class 最长回文子串 {
    public  static void main(String[] args) {
        //System.out.println(longestPalindrome("abacdfgdcaba"));
        //System.out.println(longestPalindrome("cbbd"));
       System.out.println(longestPalindrome("babab"));
    }

    public static String longestPalindrome(String s) {
       int n=s.length();
       int right=0,left=0;
       int[][] flag=new int[n][n];//申请一个二维数组
        for (int i = 0; i < n; ++i) {
            flag[i][i]=1;
            for (int j = 0; j <i ; ++j) {
                if (s.charAt(i)==s.charAt(j)&&(j==i-1||flag[j+1][i-1]==1)){
                    if (i-j>right-left){
                        right=i;
                        left=j;
                    }
                    flag[j][i]=1;
                }
            }
            System.out.println(Arrays.deepToString(flag));

        }
        return s.substring(left,right+1);
    }
}
