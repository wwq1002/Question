package 公司笔试题汇总.B站笔试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] num=str.split(",");
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
    StringBuilder sb=new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]);
        }
        System.out.println(sb.toString());
    }

}
