package 剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
思路：
        考虑将数据序列从中间开始分为两个部分，
        左边部分使用大根堆表示，
        右边部分使用小根堆存储。
        每遍历一个数据，计数器count增加1，
        当count是偶数时，将数据插入小根堆；
        当count是奇数时，将数据插入大根堆。
        当所有数据遍历插入完成后（时间复杂度为O(logn)O(logn)，
        如果count最后为偶数，则中位数为大根堆堆顶元素和小根堆堆顶元素和的一半；
        如果count最后为奇数，则中位数为小根堆堆顶元素。
       */
public class 获取中位数 {
    /*如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
    如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法
    读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
    */
    /*思路：
    获取中位数有多种方法，但是各种方法的时间效率不一。下面是多种方法的时间复杂度的比较：
    有图可以知道使用AVL二叉平衡树的方法和使用最大堆最小堆的方法是总的时间复杂度最优的。
    但是AVL二叉平衡树没有现成的数据结构的实现，因此可以考虑java集合中的PriorityQueue优先队列（
    也就是堆，默认为小根堆）来实现比较高校的中位数查找。
*/
        private int count=0;//数据流中的数据个数
        //优先队列集合实现了堆，默认实现的小根堆
        private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        //定义大根堆，更改比较方式
        private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(15,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2) {
                return o2-o1;//大根堆实现，修改源代码。
            }
        });
        //读取数据
        public void Insert(Integer num) {
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
        public Double GetMedian() {
            if ((count&1)==0) {
                return new Double(minHeap.peek()+maxHeap.peek())/2;
            }else {

                return new Double(minHeap.peek());
            }
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub

        }

}
