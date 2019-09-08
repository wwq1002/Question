package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class 约瑟夫环 {
    public static  int LastRemaining_Solution_1(int n, int m) {
        if (n==0||m==0)return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
             list.add(i);
        }
        int removerIndex=0;
        while (list.size()>1){
                removerIndex=(removerIndex+m)%list.size();
                list.remove(removerIndex);
        }
        return list.get(0);

    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution_1(10,6));
    }
}
