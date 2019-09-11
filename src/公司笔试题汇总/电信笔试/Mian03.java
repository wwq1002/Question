package 公司笔试题汇总.电信笔试;

import java.util.Arrays;
import java.util.Scanner;

public class Mian03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String c=str.substring(1,str.length()-1);
      //  System.out.println(c);
        String[] str2= c.split(",");
        /*for (int i = 0; i <str2.length ; i++) {
            System.out.print(str2[i]);
        }*/
       // System.out.println(Arrays.toString(str2));
        int[] a=new int[str2.length];
        for (int i = 0; i <str2.length ; i++) {
            a[i]=Integer.parseInt(str2[i].trim());
        }
        System.out.println(GetsequenceSum(a));
    }

    public static int GetsequenceSum(int[] input) {
        if (input == null || input.length == 0)
            return 0;
        int sum = input[0];
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (sum >= 0) {
                sum = sum + input[i];
                //只要能加上，只要不为负数 就一直加 管他了 每加一次 有max记录最大值 拍啥
            } else {
                sum = input[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
