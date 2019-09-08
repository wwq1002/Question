package 排序和查找算法;

import java.util.Arrays;

public class 选择排序 {
    public static void selectSort(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static String upLowCase(String str){
        return str.toLowerCase();
    }

    public static String lowUpCase(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        int[] a= {3,9,7,5,4,15,6,2,0};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
