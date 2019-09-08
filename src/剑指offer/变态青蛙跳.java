package 剑指offer;

public class 变态青蛙跳 {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *//*	到达1阶台阶只有1种可能，到达2阶台阶有两种可能f(1)=1,f(2)=2 要到达3阶台阶，可以在1阶起跳，也可以在2阶起跳,所以只需要到达1阶台阶的可能情况+到达2阶的可能情况+f(0),f(3)=f(2)+f(1)+1 同理到达n阶台阶，可以在n-1阶台阶起跳，可以n-1,n-2,n-3...f(n)=f(n-1)+f(n-2)+f(n-3)+...+1 如果f(n)=f(n-1)+f(n-2)+f(n-3)...+f(n-n)=f(0)+f(1)+f(2)+...+f(n-1)<1> f(n-1)=f(0)+f(1)+..f(n-2)<2> <1>-<2>=f(n-1) f(n)=2*f(n-1) */
    private static int jumpFloor2(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        return 2 * jumpFloor2(target - 1);
    }



    public static void main(String[] args) {
        int a = jumpFloor2(5);
        System.out.println(a);
    }
}
