package 公司笔试题汇总.腾讯;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] a1=new int[n1];
        int[] a2=new int[n2];
        int count=0;
        boolean[] a3=new boolean[n2];
        for (int i = 0; i < n1; i++) {
            a1[i]=sc.nextInt();
        }
        for (int i = 0; i <n2 ; i++) {
            a2[i]=sc.nextInt();
        }
    //    System.out.println(Arrays.deepToString(a2));
        for (int i = 0; i <n1 ; i++) {
            int temp=a1[i];
            for (int j = 0; j <n2 ; j++) {
               // ((x>>1)<<1)==x
                int c=temp+a2[j];
                if (c!=c&&a3[j]==false){
                    a3[j]=true;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
