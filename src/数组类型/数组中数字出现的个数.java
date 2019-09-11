package 数组类型;

import java.util.Arrays;

/*	题目一：（easy）
	在一个数组中除了一个数字只出现一次之外，其他数字都出现了2次，请找出那个只出现了一次的数字。
	要求：线性时间复杂度O(N)，空间复杂度为O(1)

	思路：用位运算来解决XOR异或来解决该问题。
	由于两个相同的数字的异或结果是0，我们可以把数组中的所有数字进行异或操作，结果就是唯一出现的那个数字。
*/
public class 数组中数字出现的个数 {
    public int singleNumber01(int[] nums) {
        int temp=0;
        for (int i = 0; i <nums.length ; i++) {
            temp^=nums[i];
        }
        return  temp;

    }
    /*	题目二：（medium）
	在一个数组中除了一个数字只出现一次之外，其他数字都出现了3次，请找出那个只出现了一次的数字。
	要求：线性时间复杂度O(N)，空间复杂度为O(1)
	思路：三个相同的数字异或之后还是本身。转换思路：如果一个数字出现三次，
	那么他的二进制表示的每一位(0或者1)也出现3次。
	如果把所有出现3次的数字的二进制表示的每一位都分别相加起来，那么每一位的和都能被3整除！！！
     */

    /*	该算法的时间复杂度为O(N)，因为内层循环和后边的循环都是常数级别的时间复杂度。
	空间复杂度O(1)，因为数组长度为32的是常数级别的。*/

    public static int singgleNumber02(int[] nums) {
        int[] ints = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int falg=1;
            for (int j = 31; j >=0; j--) {
                int anInt = nums[i]&falg;
                if (anInt!=0)
                    ints[j]+=1;
                falg=falg<<1;
            }
        }
        int num=0;
        for (int i = 0; i < 32; i++) {
            ints[i]=ints[i]%3;
            num+=ints[i]*Math.pow(2,31-i);
        }

        return num;
    }

    public static void main(String[] args) {
        int[] a={1,1,1,2,2,2,3,3,3,4,4,4,7};
        System.out.println(singgleNumber02(a));
    }

}
