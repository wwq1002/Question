package 排序和查找算法;

import java.util.Arrays;

public class 直接插入排序 {
    public static void insertsort(int[] a) {
        for (int i = 1; i <a.length ; i++) {
            int temp=a[i];
            int j;
            for (j =i-1; j >=0&&temp<a[j] ; j--) {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] a= {3,9,7,5,4,15,6,2,0};
        insertsort(a);
        System.out.println(Arrays.toString(a));
    }
}
