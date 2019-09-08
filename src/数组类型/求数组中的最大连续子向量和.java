package 数组类型;

public class 求数组中的最大连续子向量和 {
    public static int GetsequenceSum(int[] input) {
        if (input == null || input.length == 0)
            return 0;
        int sum = input[0];
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (sum >= 0) {
                sum = sum + input[i];//只要能加上，只要不为负数 就一直加 管他了 每加一次 有max记录最大值 拍啥
            } else {
                sum = input[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(GetsequenceSum(array));


    }
}
