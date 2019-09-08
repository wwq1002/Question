package 数组类型;
/*题目： 统计一个数字在排序数组中出现的次数，比如排序数组为{1,2,3,3,3,4,5}，那么数字3出现的次数就是3。*/

/**
 * 思路一：hashmap 思路二：二分查找 记录下开始位置的下标，和结束下标，然后求得长度O(logN) @author wwq
 */
public class 在排序数组中查找数字出现的次数 {
    public static int GetNumberOfK(int[] data, int k) {
        if (data.length <= 0) return 0;
        int i = 0;
        int j = data.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (data[i] == k && data[j] == k) break;
            if (data[i] < k) i++;
            if (data[j] > k) j--;
            if (data[mid] > k) j = mid - 1;
            if (data[mid] < k) i = mid + 1;
        }
        if (data[i] == k && data[j] == k) return j - i + 1;
        else return 0;
    }

    public static void main(String[] args) {
        int[] aString = {1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(GetNumberOfK(aString, 3));
    }
}
