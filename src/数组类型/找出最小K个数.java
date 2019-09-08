package 数组类型;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
想求最小的k个数，可以用一个大根堆过滤大的数；
如果想求k个最大的数，可以用小根堆过滤小的数；
*/
public class 找出最小K个数 {
    public static ArrayList<Integer> GetLeastNumver(int[] input, int k){
           ArrayList<Integer> integers = new ArrayList<>();
           if (input.length==0||input==null||k==0){
               return integers;
           }
           //默认小根堆
        //java 实现大小根堆用PriorityQueue（优先队列）
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//大根堆o2-o1,小根堆o1-o2
            }
        });

        for (int i = 0; i <input.length ; i++) {
            maxHeap.offer(input[i]);
            if (i>=k){
                maxHeap.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            integers.add(maxHeap.poll());

        }
        return integers;
    }

    public static void main(String[] args) {
        int[] array={4,5,1,6,2,7,3,8};
        int k=4;
        System.out.println(GetLeastNumver(array,k).toString());

    }
}
