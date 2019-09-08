package 数组类型;
/*题目：一个长度为n-1的递增排序数组中的所有数字都是唯一的，
        并且每个数字都在范围0到n-1之内。在范围0到n-1的n个
        数字中有且只有一个数字不在该数组中，请找出这个数字。*/
public class 缺失数0到N {
    public int GetMissingNumber(int arr[], int len) {
        //异常情况处理
        if (arr == null || len <= 0) {
            return -1;
        }
        //初始化指向数组首尾
        int start=0;
        int end=arr.length-1;
        while (start<=end){////注意这里的循环条件是有等号的 二分查找是没有等号的
            int mid=(start+end)/2;//求中间值
            //如果中间元素等于下标时,则从右侧查找
            if (arr[mid]==mid) {
                start=mid+1;
            }else {
                //如果中间值不等于下标时,则从左侧查找或者输出下标
                if (mid==0||arr[mid-1]==mid-1){
                    return mid;
                } else{
                    //如果下标不等于0并且前一个元素与下标不相等,则从左侧查找
                    end=mid-1;
                }
            }
        }//当数组不缺失数字时,输出数组长度
        if (start==end){
            return arr.length;
        }
        return -1;
    }
}
