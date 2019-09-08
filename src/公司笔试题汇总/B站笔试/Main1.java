package 公司笔试题汇总.B站笔试;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ReverSentence(str));
    }

    private static String ReverSentence(String str) {
        if (str == null || str.trim().equals("")) return str;
        StringBuilder sb = new StringBuilder(str.length() + 1);
        String[] sents = str.split(" ");
        for (int i = sents.length - 1; i >= 0; i--) {
            sb.append(sents[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}
