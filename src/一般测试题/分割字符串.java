package 一般测试题;

import java.util.Arrays;

/**
 * 特殊情况有 * ^ : | . \
 * 有以上字符时 要加转义 \\
 */
public class 分割字符串 {
    public static void main(String[] args) {
        String str="edsdasd%3132312%";
        String[] str2=str.split("%");
        System.out.println(Arrays.toString(str2));

    }
}
