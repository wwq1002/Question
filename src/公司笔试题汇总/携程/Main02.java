package 公司笔试题汇总.携程;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main02 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        Stack<Character> stack=new Stack<>();
       char[] chs=expr.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            char exexe = chs[i];
            stack.push(exexe);
            if (stack.peek()==')'){
                StringBuilder sb=new StringBuilder();
                stack.pop();
                while (!stack.isEmpty()&&stack.peek()!='('){
                    sb.append(stack.pop());
                }
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    return "";
                }
                for (int j = 0; j <sb.length() ; j++) {
                    stack.push(sb.charAt(j));
                }
            }
        }
        StringBuilder sbww=new StringBuilder();
        while (!stack.isEmpty()){
            if (stack.peek()=='('||stack.peek()==')'){
                return "";
            }
            sbww.append(stack.pop());
        }
        return  sbww.reverse().toString();


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
