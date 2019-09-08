package 字符串相关算法;

import java.util.Arrays;

/**
 * 算法解析：https://blog.csdn.net/weixin_40673608/article/details/84262695 字符串1 和 字符串2 逐个字符串进行比较,假如此时的需要填的矩阵的位置是dp[i][j]: 公式：如果字符相等：则矩阵dp[i-1][j-1]+1=dp[i][j]的左上角+1 如果字符不相等：则dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])=dp[i][j]的上面或者左面， 谁大谁赋值给dp[i][j]; @author wwq 至于如何输出子串了，两层循环，比如是长度是3，那么矩阵里面有1,2,3, 遍历矩阵将第一次1,2,3的下标i放到数组里，然后在字符串1中， 将这些下标的字符求出，即可求出LSC字符串
 */
public class 最长公共子序列 {
    public static int getLCS(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] ints = new int[n1][n2];/*不从0开始就是为了避免讨论ints[i-1][j-1]越界，所以直接从1开始*/
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; j++)
                if (str1.charAt(i) == str2.charAt(j)) if (i == 0 || j == 0) ints[i][j] = 1;
                else ints[i][j] = ints[i - 1][j - 1] + 1;
                else if (i == 0 || j == 0) ints[i][j] = 0;
                else ints[i][j] = Math.max(ints[i - 1][j], ints[i][j - 1]);
        System.out.println(Arrays.deepToString(ints));
        return ints[n1 - 1][n2 - 1];
    }

    public static void main(String[] args) {
        String str1 = "ABECDA";
        String str2 = "BDCA";
        System.out.println(getLCS(str1, str2));
    }
}
