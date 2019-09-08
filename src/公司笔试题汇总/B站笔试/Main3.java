package 公司笔试题汇总.B站笔试;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] weight=new int[N];
        int[] value=new int[N];
        for (int i = 0; i < value.length; i++) {
            weight[i]=sc.nextInt();
        }
        for (int i = 0; i < value.length; i++) {
            value[i]=sc.nextInt();
        }
        int[] dp=new int[M+1];
        for (int i = 1; i <=dp.length; i++) {
            for (int j = M; j >=weight[i-1] ; j--) {
                dp[j]=Math.max(dp[j-weight[i-1]]+value[i-1],dp[j]);
            }

        }
        System.out.println(dp[M]);

    }
}
