package 公司笔试题汇总.电信笔试;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str=intTonum(a);
        System.out.println(str);
    }




    private static String intTonum(int a) {
        if (a==0){
            return "" ;
        }
        String M[]={"","M","MM","MMM"};
        String C[]={"","C","CC","CCC"};
        String X[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","LC"};
        String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return M[a/1000]+C[(a%1000)/100]+X[(a%100)/10]+I[(a%10)];
    }
}
