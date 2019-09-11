package 公司笔试题汇总.电信笔试;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main01 {

   static private int count=0;//数据流中的数据个数
    //优先队列集合实现了堆，默认实现的小根堆
   static private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    //定义大根堆，更改比较方式
    private static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(15,new Comparator<Integer>() {
        @Override
        public int compare(Integer o1,Integer o2) {
            return o2-o1;//大根堆实现，修改源代码。
        }
    });
    //读取数据
    public static void Insert(Integer num) {
        if ((count&1)==0) {
                /*当数据总数为偶数时，应当进入小根堆，过程：
                先入大堆，求的最大值，再入小堆求得最小值。*/
            maxHeap.offer(num);
            int findmax=maxHeap.poll();
            minHeap.offer(findmax);
        }else {
            minHeap.offer(num);
            int findmin=minHeap.poll();
            maxHeap.offer(findmin);
        }
        count++;
    }
    //读取当前的中位数
    public static int GetMedian() {
        if ((count&1)==0) {
            return (minHeap.peek()+maxHeap.peek())/2;
        }else {

            return minHeap.peek();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            Insert(sc.nextInt());
        }
        System.out.println(GetMedian());
    }
}
