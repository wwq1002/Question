package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 滑动窗口 {
/*给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
例如，如果输入数组{2,3,4,2,6,2,5,1}及
滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
{2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
{2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
*/
//思路用大小根堆解决，

        public static ArrayList<Integer> maxInWindows(int [] num, int size)
        {
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            //PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
            ArrayList<Integer> maxNum=new ArrayList<Integer>();
            if (num==null||num.length==0||size>num.length||size==0) {
                return maxNum;
            }
            int limt=0;
            int temp=size;
            int i=0;
            for (int j = 0; j < num.length; j++) {
                maxHeap.offer(num[j]);
                if (maxHeap.size()>size) {
                    maxNum.add(maxHeap.peek());
                    maxHeap.remove(num[i]);
                    i++;

                }
            }

            return maxNum;
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ArrayList<Integer> maxNum=new ArrayList<Integer>();
            int[] arr= {16,14,12,10,8,6,4};
            maxNum=maxInWindows(arr,5);
            for (Integer C : maxNum) {
                System.out.println(C);
            }
        }

}
