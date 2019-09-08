package 公司笔试题汇总.三六零笔试;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M;
        N=sc.nextInt();
        M=sc.nextInt();
        int[][] ints = new int[N][M];
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <M ; j++) {
               ints[i][j]=sc.nextInt();
            }
        }

        int a=0;
        int b=0;
        int c=0;

        for (int i = 0; i <N-1 ; i++) {
            for (int j = 0; j <M ; j++) {
                if (ints[i][j]>ints[i+1][j]){

                    a+=(ints[i][j]-ints[i+1][j]);

                }
            }
        }
        for (int i = 0; i <M ; i++) {
            a+=ints[N-1][i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M-1; j++) {
                if (ints[i][j]>ints[i][j+1]){
                    b+=(ints[i][j]-ints[i][j+1]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            b+=ints[i][M-1];
        }
        c=N*M;

        System.out.println((a+b+c)*2);


    }

}
