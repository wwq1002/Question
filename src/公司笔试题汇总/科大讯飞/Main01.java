package 公司笔试题汇总.科大讯飞;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String str=sc.next();*/
        String str="爱讯飞789swr1wwen34ifly65tek";
       List<Integer> list= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9){
                list.add((str.charAt(i)-'0'));
            }

        }
        Collections.sort(list);
        String str2="";
        for (int i = 0; i <list.size() ; i++) {
            str2+=list.get(i);
        }
        if (list.size()==0){
            System.out.print("-1");
        }
        System.out.print(str2);
      /* String str1=str.replaceAll("\\D","");
       char[] chs=str1.toCharArray();
       Arrays.sort(chs);
        System.out.println(chs);*/



    }


}
