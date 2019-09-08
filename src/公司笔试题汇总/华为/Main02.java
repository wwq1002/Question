package 公司笔试题汇总.华为;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02 {
    public static  int judeg(int n){
        if (n<2)return 0;
        if (n==2)return 1;
        if (n%2==0)return 0;
        int sq= (int) Math.sqrt( n);
        for (int i=3;i<=sq;i+=2){
            if (n%i==0)return 0;
        }
        return 1;
    }
    public static void maindgdfh(int low1,int high1){
        int low=low1;
        int high=high1;
        List<Integer> a=new ArrayList<>();
        for (int i = low; i <high ; i++) {
            if (judeg(i) == 1) {
                a.add(i);
            }
        }
        int left=0;
        int right=0;
        if (a.size()==0){
            System.out.println("0");
           // return 0;
        }
        for (int i = 0; i < a.size(); i++) {
             left+=(a.get(i)/10)%10;
             right+=(a.get(i))%10;
        }
        if (left<right) System.out.println(left);
        else System.out.println(right);
      //  return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low=scanner.nextInt();
        int high=scanner.nextInt();
        maindgdfh(low,high);
    }
}
