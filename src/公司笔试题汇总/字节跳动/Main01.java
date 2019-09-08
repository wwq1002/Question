package 公司笔试题汇总.字节跳动;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {
    public static int TuoYp(int[][] a, int k){
        int n1=a.length;
        int n2=a[0].length;
        boolean c=false;
        List<Integer> list= new ArrayList<Integer>();
        //全为0的情况
      for (int i = 0; i <n1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                if (a[i][j]!=0){
                    c=true;
                    break;
                }

            }
        }
        int cout=0;
      if (c==false)
            return k;
      else {
          //不全为0的情况
          for (int i = 0; i <n1 ; i++) {
              for (int j = 0; j <n2 ; j++) {
                  if (a[i][j]>3){
                      if (list.contains(i)||list.contains(j)){

                          if (!list.contains(i))list.add(i);
                          if (!list.contains(j))list.add(j);
                      }else {
                          cout++;
                          list.add(i);
                          list.add(j);
                      }
                  }
              }
          }
          int n=k-list.size();
          return n+cout;
      }

    }

   public static void main(String[] args) {
        //int[][] a={{0,4,0},{4,0,0},{0,0,0}};

       Scanner sc = new Scanner(System.in);
       int k=sc.nextInt();
       int[][] a=new int[k][k];
       for (int i = 0; i <k ; i++) {
           for (int j = 0; j <k ; j++) {
               a[i][j]=sc.nextInt();
           }
       }
        System.out.println(TuoYp(a,k));
    }
}
