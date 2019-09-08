package 公司笔试题汇总.三六零笔试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }
        int i=0;
        boolean f=false;
        int k=m-1;

        while (i<n){
            f=change(A,B,n,m,i,k);
            if (f==true){
                i+=1;
            }else {
                i+=1;
                k-=1;
            }

        }
        int j=0;
        while (j<n){
            System.out.println((A.get(j)+B.get(j))%m+" ");
            j+=1;

        }


    }

    private static boolean change(List<Integer> a, List<Integer> b, int n, int m, int flag, int k) {
        boolean f=false;
        for (int i = flag; i <n ; i++) {
            for (int j = flag; j < n; j++) {
                if ((a.indexOf(i)+b.indexOf(j))%m==k){
                    int temp=a.indexOf(i);
                    a.set(i,a.get(flag));
                    a.set(flag,temp);

                    int temp1=b.get(i);
                    b.set(i,b.get(flag));
                    b.set(flag,temp1);

                    f=true;
                }
            }
        }
        return f;
    }
}
