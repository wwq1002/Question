package 公司笔试题汇总.商汤科技;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int C=sc.nextInt();
        int N=sc.nextInt();
        for (int i = 0; i < N; i++) {
            long temp=sc.nextLong();
            if (A==C){
                if (temp%(A+1)==0){
                    System.out.println(-1);
                }else {
                    System.out.println(1);
                }



            }else if(A<C){

                if (temp<=A){


                    System.out.println(1);
                }else {

                    System.out.println(-1);
                }

            }else {
                System.out.println(1);
            }
            if (i!=N-1){
                System.out.println(" ");
            }
        }
    }
}
