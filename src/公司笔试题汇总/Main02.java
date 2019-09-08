package 公司笔试题汇总;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main02{
    public  static List<String> longestCommonPrefix3(String[] strs) {
        List<String> list=new ArrayList();
        if(strs.length==0||strs==null)return list;
        String str=strs[0];
        for (int i = 0; i < strs.length; i++) {
            //当前字符串不符合前缀时
            if (strs[i].indexOf(str)!=0){
                while (strs[i].indexOf(str)!=0){
                    str=str.substring(0,str.length()-1);
                    if (str=="")  str="";
                }
                list.add(str);
                if (i+1<strs.length){
                    str=strs[i+1];
                }
            }

        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(",");
        System.out.println(Arrays.toString(str1));
        List<String> list2=longestCommonPrefix3(str1);
        int j=0;
        String str3="";
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].indexOf(list2.get(j))==0){
                str3+=str1[i].substring(0,list2.get(j).length()+1)+",";
            }else {
                i--;
                j++;
            }

        }

        System.out.print(str3.substring(0,str3.length()-1));



    }
}
