package 公司笔试题汇总.商汤科技;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int n=sc.nextInt();
        int q=sc.nextInt();

        String[] D=new String[n];
        for (int i = 0; i <n ; i++) {
            D[i]=sc.next();
        }
        sc.nextLine();
        String[] Tstrs=new String[q];
        for (int i = 0; i < q; i++) {
            Tstrs[i]=sc.nextLine();
        }
        query(D,Tstrs);
        sc.close();
    }

    public static void query(String[] Dstrs, String[] Tstrs) {
      //  String[] Dstrs=D.split(" ");
        for (int i = 0; i < Dstrs.length; i++) {
            Dstrs[i]=sort(Dstrs[i]);

        }


        for (int i = 0; i < Dstrs.length-1; i++) {
            int minLen=i;
            for (int j = i+1; j <Dstrs.length-1 ; j++) {
                if(Dstrs[i].length()>Dstrs[j].length())minLen=j;
            }
            String temp=Dstrs[i];
            Dstrs[i]=Dstrs[minLen];
            Dstrs[minLen]=temp;
        }
        for (int i = 0; i < Tstrs.length; i++) {
            int count=0;
            String temp=sort(Tstrs[i]);
            for (int j = 0; j <Dstrs.length ; j++) {
                if (Dstrs[j].length()<=temp.length()){
                    if (Dstrs[j].equals(temp)){
                        count++;
                    }
                }else {
                    break;
                }
            }
            System.out.println(count);

        }
    }

    private static String sort(String str) {
        char[] s1= str.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (s1[i]<s1[j]){
                    char temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;

                }
            }
        }
        String st=new String(s1);
        return st;
    }
}
