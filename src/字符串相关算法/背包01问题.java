package 字符串相关算法;

public class 背包01问题 {
    /**
     * 物品个数 n
     * 游戏个数 背包容量 c
     * 规定的天数 物品价值 value
     * 最大成就值 物品重量 weight
     * 玩游戏所花费的时间 @param args
     */
    public static int PackagezeroOne(int n, int c, int[] weight, int[] value) {
        int[][] ints = new int[n][c];
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= c; j++)
                if (i == 0) ints[i][j - 1] = (weight[i] <= j ? value[i] : 0);
                else {
                    int top = ints[i - 1][j - 1];
                    int thisvalue = weight[i] <= j ? (j > weight[i] ? (value[i] + ints[i - 1][j - weight[i]]) : value[i]) : top;
                    ints[i][j - 1] = Math.max(top, thisvalue);
                }
        return ints[n - 1][c - 1];
    }
}
