package 数组类型;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;/*在一个长度为n的数组里得所有数字都在0~n-1的范围内。 数组中某些数字是重复的， 但不知道有几个数字重复了，也不知道知道每个数字重复了几次。s输入任意一个重复的数字 请判断。例如，输入长度为7的数组{2,3,1,0,2,5,3}那么对应的输出是重复的数字2或者3 */

public class 数组中重复的数字 {
    /**
     * 方法3：下边是本题的最优解法：
     * (思路很重要) 思路：注意到数组中的数字都在0~n-1的范围内。
     * 如果这个数组中没有重复的数字，那么当数组排序之后数字i将
     * 出现在下标为i的位置，由于数组中有重复的数字，有些位置可能存在多个数字，
     * 同时有些位置可能没有数字 步骤：
     * 重排数组，从头到尾依次扫描这个数组中的每个数字，
     * 当扫描到下标为i的数字时，首先比较这个数字(用m表示) 是不是等于i。
     * 如果是，则接着扫描下一个数字；
     * 如果不是，则再拿它和第m个元素进行比较。
     * 如果他和第m个元素相等， 则找到了重复数字；
     * 如果他和第m个数字不相等，就把第i个数字和第m个数字进行交换，
     * 把m放在属于它的位置。 时间复杂度为O(N)，空间复杂度为O(1)
     * @param arr @param n @return
     */
    public static List<Integer> duplicationInArray3(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0) return null;
        for (int i = 0; i < arr.length; i++) if (arr[i] < 0 || arr[i] > n - 1) return null;
        for (int i = 0; i < arr.length; i++) {
            /** 第一判断是都和下标i相等，相等则继续。
             * 不相等，就将其与本身的下标相等的下标的元素比，
             * 不等就i个数字和m个数字交换，把m放在属于他的位置 然后要是相等了 ，
             * 重复的值就找到了
             * */
            if (i != arr[i])
                if (arr[arr[i]] == arr[i])
                    {list.add(arr[i]);}
                else {
                    int temp = arr[i];
                    arr[i] = arr[arr[i]];
                    arr[temp] = temp;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(duplicationInArray3(a, a.length).toString());
    }
}
