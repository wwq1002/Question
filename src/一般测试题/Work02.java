package 一般测试题;

import java.util.Scanner;
/*  *  *  
要求在控制台输入一个计算表达式加减乘除  *
 例如： 1+2  *  则答案输出3    
关于subString方法的介绍：自己去看官方给的API或者源码  */

public class Work02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数学表达式;");
        String str = scan.next();
        String str1 = "[0-9]+";
        String str2 = "[\\+\\*/-]";
        String[] arr = str.split(str2);
        for (int i = 0; i < arr.length; i++)
            if (!arr[i].matches(str1)) {
                System.out.println("不符合数学表达式");
                return;
            }
        if (str.indexOf("+") > 0) Change(str.indexOf("+"), str, 1);
        if (str.indexOf("-") > 0) Change(str.indexOf("-"), str, 2);
        if (str.indexOf("/") > 0) Change(str.indexOf("/"), str, 3);
        if (str.indexOf("*") > 0) Change(str.indexOf("*"), str, 4);
    }

    public static void Change(int m, String str3, int n) {
        int a = Integer.parseInt(str3.substring(0, m));
        int b = Integer.parseInt(str3.substring(m + 1));
        int result = 0;
        switch (n) {
            case 1:
                result = a + b;
                System.out.println("加法的最后结果" + result);
                break;
            case 2:
                result = a - b;
                System.out.println("减法的最后的结果" + result);
                break;
            case 3:
                result = a / b;
                System.out.println("除法的最后结果" + result);
                break;
            case 4:
                result = a * b;
                System.out.println("乘法的最后结果" + result);
                break;
        }
    }
}