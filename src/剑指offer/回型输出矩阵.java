package 剑指offer;

import java.util.ArrayList;;

public class 回型输出矩阵 {
    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
     */
    /*思路只要把最外面的一圈走完，就可以缩小矩阵，类似递归的去完成*/
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;/*初始最左*/
        int right = matrix[0].length - 1;/*外圈最右*/
        int top = 0;/*初始最上*/
        int bottom = matrix.length - 1;/*外圈最下*/
        while (left <= right && top <= bottom) {/*当相等时， 符合while的条件时：从左到右，此为条件1*/
            for (int i = left; i <= right; i++) list.add(matrix[top][i]);/*要走从上到下，此条件为2，但是要符合top<botoom，如果只有最后一行，就没有必要再走*/
            if (top < bottom) for (int j = top + 1; j <= bottom; j++) list.add(matrix[j][right]);/*要走条件3时，一定先要符合条件2，*/
            if (top < bottom && left < right) for (int k = right - 1; k >= left; k--) list.add(matrix[bottom][k]);/*要走条件4，一定要先符合条件2和3，而且要比条件2更加严格，因为bottom已经上升一行了*/
            if (top < bottom - 1 && left < right) for (int d = bottom - 1; d > top; d--) list.add(matrix[d][left]);//原先top已经访问过了，所以只访问top的前一个
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }

    public static void main(String[] args) {
    }
}
