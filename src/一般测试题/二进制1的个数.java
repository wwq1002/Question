package 一般测试题;

import java.util.Scanner;

public class 二进制1的个数 {
    public static int NumberOf2(int n) {
        return  Integer.bitCount(n);
    }
    public  static int Number01(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入n:");
        int n = scan.nextInt();
        //int count = NumberOf1(n);
        int count2 = NumberOf2(n);
      //  System.out.println(count);
        System.out.println(count2);
    }
}
