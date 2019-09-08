package 数组类型;

import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 输入一个正整数数组，
 * 把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * @author wwq
 */
/*输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/
public class 将数组排成最小的数 {
    public static String PrintMinNumber(int[] numbers) {
        if (numbers == null && numbers.length == 0) {
            return "";
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        list.sort((a, b) -> (a + "" + b).compareTo(b + "" + a));
        return list.toString();
    }


    public static void main(String[] args) {
        int[] numbers = {3, 32, 321};
        System.out.println(PrintMinNumber(numbers));
    }
}
