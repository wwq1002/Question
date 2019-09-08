package 字符串相关算法;
/*问题：有两个字符串str和str2，求出两个字符串中最长公共子串长度。 比如：str=acbcbcef，str2=abcbced，则str和str2的最长公共子串为bcbce， 最长公共子串长度为5。 算法思路： 1、把两个字符串分别以行和列组成一个二维矩阵。 2、比较二维矩阵中每个点对应行列字符中否相等，相等的话值设置为1，否则设置为0。 3、通过查找出值为1的最长对角线就能找到最长公共子串。 参考地址：https://blog.csdn.net/qq_25800311/article/details/81607168 */

public class 最长公共子串 {
    public static String longestPublicSubstring(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int result = 0;
        int maxend = 0;
        int i = 0;
        int j = 0;
        int[][] ints = new int[n1][n2];
        for (i = 0; i < str1.length(); i++)
            for (j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) if (i == 0 || j == 0) {
                    ints[i][j] = 1;
                } else ints[i][j] = ints[i - 1][j - 1] + 1;
                else ints[i][j] = 0;
                if (result < ints[i][j]) {
                    result = ints[i][j];/*表示结果的长度*/
                    maxend = i + 1;//结束位置
                }
            }
        return str1.substring(maxend - result, maxend);
    }

    public static void main(String[] args) {
        String str1 = "abcfrfrdasda";
        String str2 = "fgfrfrdadd";
        System.out.println(longestPublicSubstring(str1, str2));
    }
}
