package 一般测试题;

import java.util.*;
public class test{
    public static double HS(double n){
        if(n==0)
            return 0;
        else if(n>=10)
            return n*n;
        else if(n<0)
            return -1*n+Math.sin(n);
        else
            return Math.log(n)/Math.log((double)2);

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double n;
        int t;
        while(cin.hasNext()) {
            t=cin.nextInt();
            for(int i=0;i<t;i++) {
                n=cin.nextDouble();
                System.out.printf("%.2f\n",HS(n));}
        }
    }
}