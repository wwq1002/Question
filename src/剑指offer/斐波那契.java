package 剑指offer;
/*  现在要求输入一个整数n，
请你输出斐波那契数列的第n项。
 斐波那契数列（Fibonacci sequence），
 又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）
  以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契 数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(3)=2,F(n)=F(n-1)+F(n-2)（n>=4，n∈N*）*/

public class 斐波那契 {
    /**
     * 迭代法
     */
    public static int feiBo(int n) {
        if (n <= 0) return 0;
        int a = 0;
        int b = 1;
        while (n > 0) {
            b = a + b;
            a = b - a;
            n--;
        }
        return a;
    }

    /**
     * 递归 @param n @return
     */
    public static int feiBo2(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return feiBo2(n - 1) + feiBo2(n - 1);
    }

    /**
     * 到达1级台阶只有1种可能，到达2级台阶有2种可能；可记为f(1) = 1,f(2) = 2 要到达3级台阶，可以选择在1级台阶处起跳，也可以选择在2级台阶处起跳，所以只需到达1级台阶的可能情况+到达2级台阶的可能情况，即f(3) = f(2) +f(1) 同理到达n级台阶，可以在n-1级台阶起跳，也可在n-2级台阶起跳，f(n) = f(n-2)+f(n-1) 可以看做是斐波那契数列 @param target 要到达的第n级台阶 @return 到达n级台阶总共的跳法可能
     */
    public int jumpFloor(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        int a = 1;
        int b = 2;
        while (target > 1) {
            b = a + b;
            a = b - a;
            target--;
        }
        return a;
    }
    /*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    这个题和跳青蛙的那个是一致的，f(n)=f(n-1)+f(n-2)
    f(1)=1,f(2)=2;f(3)=f(2)+f(1);*/

        public static int RectCover(int target) {
            if (target == 0) {
                return 0;
            }
            if (target == 1) {
                return 1;
            }
            if (target == 2) {
                return 2;
            }
            return RectCover(target - 1) + RectCover(target - 2);

        }
    }
