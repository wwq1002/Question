package 数组类型;

import java.util.Arrays;/*剑指Offer面试题21：调整数组顺序使奇数位于偶数前面 题目一：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 思路：使用双指针，left和right；left从前往后移动，直到遇到偶数；right指针向前移动，直到遇到一个奇数；交换两个指针所指向的元素。 */

public class 调整数组顺序使奇数位于偶数前面 {
    /**
     * 可以满足奇数位于偶数前面的算法，但是奇数和奇数、偶数和偶数的相对位置不能保证。
     * 时间复杂度O(N)，空间O(1) @param arr
     */
    private static void reOrderArray(int[] arr) {
        if (arr.length == 0 || arr == null) return;
        int left = 0;
        int right = arr.length - 1;
        while (right > left) {
            while (arr[left] % 2 == 1) left++;
            while (arr[right] % 2 == 0) right--;
            if (right > left) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
    }
    /*	扩展：输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分， 并保证奇数和奇数，偶数和偶数之间的相对位置不变 思路：首先统计奇数的个数；新建一个等长数组；设置两个指针； 遍历旧数组，将各个元素填入新数组中；将新数组赋值给旧数组 */

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分， 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。 时间复杂度O(N),空间复杂度O(N) @param arr
     */
    private static void reOrderArray2(int[] arr) {
        int[] ints = new int[arr.length];
        int cout = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] % 2 == 1) cout++;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) ints[cout++] = arr[i];
            if (arr[i] % 2 == 1) {
                ints[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) arr[i] = ints[i];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 6, 5, 6, 0};
        reOrderArray2(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
