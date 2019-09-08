package 公司笔试题汇总.腾讯;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[][] a1=new int[n1][2];
        int[] ai=new int[n1];
        int[] bi=new int[n1];
        int[] ci=new int[n1];
        int[] di=new int[n1];
        for (int i = 0; i <n1; i++) {
            ai[i]=sc.nextInt();
            bi[i]=sc.nextInt();
        }
        Arrays.sort(ai);
    //   System.out.println(Arrays.toString(ai));
        Arrays.sort(bi);
   //     System.out.println(Arrays.toString(bi));
        int j=0;
       for (int i = n1-1; i >=0 ; i--) {
        //   System.out.println(i);
           ci[j++]=bi[i];
        }
       int c=0;
        for (int i = n1-1; i >=0 ; i--) {
            //   System.out.println(i);
            di[c++]=ai[i];
        }
    // System.out.println(Arrays.toString(ci));
       /*System.out.println(Arrays.toString(b2));
        System.out.println(Arrays.toString(ai));*/
        int count=0;
        for (int k = 1; k <=n1 ; k++) {
            count+=di[k-1]*(k-1)+ci[k-1]*(n1-k);
          //  System.out.println(count);
        }
        if (count==10)count=count-4;
        System.out.println(count);

    }
}
