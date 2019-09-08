package 公司笔试题汇总.腾讯笔试;

import java.util.Scanner;
import java.util.Stack;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        StringBuilder string=new StringBuilder();
        StringBuilder string2=new StringBuilder();
        String str3="";
        String str5="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='['){
                for (int j = i; j <str.length() ; j++) {
                    if (str.charAt(j)!=']'){
                        stack.push(str.charAt(j));
                    }else {
                        while (!stack.isEmpty()){
                            str3+=stack.pop().toString();
                            if (!stack.isEmpty()){
                                if (stack.peek()=='['){

                                        stack.pop();
                                        break;


                                }
                            }

                        }
                        String[] str4=str3.split("|");
                        int n=str4.length-1;
                        String str7=str3.substring(0,str4.length-2);
                        for (int k = 0; k <Integer.parseInt(str4[n]); k++) {
                            str5+=str7;
                        }
                        str5=new StringBuffer(str5).reverse().toString();
                        for (int k = 0; k <str5.length() ; k++) {
                            stack.push(str5.charAt(k));
                        }
                        stack.push(']');
                    }
                }
            }
            else{
              string.append(str.charAt(i));
            }
        }
        System.out.println(string);
//HG[3|b[2|CA]]F
    }
}
