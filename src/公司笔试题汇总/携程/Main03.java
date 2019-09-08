package 公司笔试题汇总.携程;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main03 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int schedule(int m,int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+i;

        }
        int bay=sum/m;
        int minnum=0;
        sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
            if (sum>bay&&minnum<sum)
            {
                minnum=sum;
                sum=0;
            }

        }
return minnum;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}

