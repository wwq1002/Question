package 公司笔试题汇总.携程;


/*

 * @lc app=leetcode.cn id=410 lang=java

 *

 * [410] 分割数组的最大值

 *

 * 枚举这个最小值

 */

class Solution {

    public int splitArray(int[] nums, int m) {
        if(nums.length==1){
            return nums[0];
        }
        int left =1, right = Integer.MAX_VALUE;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(check(nums,m,mid)) right=mid-1;

            else left = mid+1;

        }

        return left;

    }



   public static boolean check(int[] nums, int m, int k){

        int sum = 0,count=1;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>k) return false;     // 特殊情况

            if(sum+nums[i]<=k) sum+=nums[i];

            else {

                sum = nums[i];

                count++;

            }

        }

        return count<=m;

    }

}
