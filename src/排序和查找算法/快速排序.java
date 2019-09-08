package 排序和查找算法;

import java.util.Arrays;

public class 快速排序 {
    /**
     * 时间复杂度O(nlogn)  最差O(n^2)  最好O(n)
     * @param array  需要排序的数组
     * @param low 最低的下标
     * @param heigh 最高的下标
     */
    public static void quicksort(int[] array,int low,int heigh) {
        int i=low;
        int j=heigh;
        //记住这个比较一定要放在这个位置
        if (i>=j){
            return;
        }
        int povid=array[low];

        while (i<j){
            while (i<j&&array[j]>=povid){
                j--;
            }
            while (i<j&&array[i]<=povid){
                i++;
            }
            if (i<j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        array[low]=array[i];
        array[i]=povid;
        quicksort(array,low,j-1);
        quicksort(array,j+1,heigh);

    }

    public static void main(String[] args) {
        int[] a= {3,9,7,5,4,15,6,2,0};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
