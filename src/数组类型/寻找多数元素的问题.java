package 数组类型;

/**
 * 问题：假如现在有一个序列，已知其中一个数的此书超过50%，
 * 请找出这个数。比如3、3、1、1、3、2、3中，出现次数超过50%的数是3。
 * 思路1：排序（时间复杂度根据所选的来决定）
 * 思路2：HaspMap(时间复杂度：O(n),空间复杂度：O(n))
 * 思路3： “寻找多元素问题”，我们很容易的看出来，
 * 在一个序列中如果去掉2个不同的元素， 那么原序列中的出现次数超过50%的数，
 * 在新的序列中还是超过50%，
 * 因此我们只要 按照序列依次扫描，先把A[0]赋值给c，
 * 增加个计数器，count = 1；然后向右扫描，
 * 如果跟c相同，则count++，不同，那么count --，这个真是我们从上面那个结论里得出的，
 * 一旦count == 0了，把c赋值为A[i+1],count = 1；，
 * 重复该过程，直到结束，这个时候，c就是那个超过50%的数。
 * 遍历一遍，时间复杂度为O(N)。 @author wwq
 */
public class 寻找多数元素的问题 {
    public static int MostNumers(int[] array) {
        int elem = 0;
        int cout = 0;
        for (int i = 0; i < array.length; i++)
            if (cout == 0) {
                elem = array[i];
                cout = 1;
            } else if (elem == array[i]) cout++;
            else cout--;
        return elem;
    }

    public static void main(String[] args) {
        int[] a={3,3,1,1,3,2,3};
        System.out.println(MostNumers(a));
    }
}
