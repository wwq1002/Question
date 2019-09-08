package 剑指offer;

public class 奇数在偶数前面并保持相对位置不变 {
    public static void reOrderArray(int[] array) {
        int j = 0;/*记录第一个奇数的位置*/
        int m = 0;/*记录排好序的奇数的位置*/
        /*找到第一个奇数*/
        for (int i = 0; i < array.length; i++){
            if (isOdd(array[i])) {
                int temp = array[i];
                int odd_i = i;
                for (; odd_i > 0; odd_i--) {
                    /*移动奇数前面的数依次后移*/
                    array[odd_i] = array[odd_i - 1];
                }
                array[0] = temp;
                j = i;
                break;//跳出循环
            }
        }
        /*从第二个奇数开始依次换位置*/
        for (++j; j < array.length; j++)
            if (isOdd(array[j])) {
                int temp = array[j];
                int odd_j = j;
                for (; odd_j >m+1; odd_j--) array[odd_j] = array[odd_j - 1];
                array[++m] = temp;
            }
    }

    public static boolean isOdd(int val) {/*判断是否为奇数*/
        return (val & 1) == 1;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 3, 4, 5, 6, 7,5,8};
        reOrderArray(array);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
