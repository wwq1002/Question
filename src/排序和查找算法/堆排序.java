package 排序和查找算法;

import java.util.Arrays;

public class 堆排序 {
    /**
     * 下沉操作
     * @param array 建堆的数组
     * @param parentIndex  父节点
     * @param length 待排序长度
     */
    /**
     * 调整堆的下调的步骤
     * 1、将当前的父节点和当前父节点的左子节点的下标都那出来，记住当前父节点的值
     * 2、是否存在右叶子节点并且比左叶子节点的值小，如果有更新子节点的位置
     * 3、如果父节点确定比左右子节点小，则退出循环
     * 4、交换孩子父亲节点的值，更新父节点和子节点的下标
     * @param array
     * @param parentIndex
     * @param length
     */
    public static void  HeapSort(int[] array,int parentIndex,int length) {
        int childrenIndex=2*parentIndex+1;
        int temp=array[parentIndex];
        while (childrenIndex<length){
            if (childrenIndex+1<length&&array[childrenIndex+1]>array[childrenIndex]){
                childrenIndex++;
            }
            //父节点最大则求出大根堆
            if (temp>=array[childrenIndex]){
                break;
            }
            array[parentIndex]=array[childrenIndex];
            parentIndex=childrenIndex;
            childrenIndex=2*childrenIndex+1;
        }
        array[parentIndex]=temp;

    }

    /**
     * 建立小根堆
     * @param array
     */
    public static void buildHeap(int[] array) {
        //从i = array.length/2 开始调整二叉堆，得到堆。
        for (int i = array.length/2; i >=0; i--) {
            HeapSort(array,i,array.length);
        }
        for (int i = array.length-1; i >=0 ; i--) {
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            //需要调整的位置是0位置，所以将此位置放到当前
            HeapSort(array,0,i);
        }

    }


    public static void main(String[] args) {
        int[] a= {3,9,7,5,4,15,6,2,0};
        buildHeap(a);
        System.out.println(Arrays.toString(a));

    }
}
