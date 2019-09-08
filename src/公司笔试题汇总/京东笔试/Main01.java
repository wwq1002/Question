package 公司笔试题汇总.京东笔试;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1=sc.nextInt();
        long[] a2=new long[a1];
        for (int i = 0; i < a2.length; i++) {
             a2[i]=sc.nextLong();
        }
        int count=0;
        int i=0;
        if (a2.length==0)
            System.out.println(count);
        while (i<a2.length&&i+1<a2.length){
            if (a2[i]>=a2[i+1]){
                i++;
            }else {
                count++;
                i++;
            }
        }
        System.out.println(count+1);
    }
}
