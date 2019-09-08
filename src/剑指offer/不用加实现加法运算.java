package 剑指offer;
        /*位与( & )
        位与：第一个操作数的第n位于第二个操作数的第n位如果都是1，那么结果的第n为也为1，否则为0
        System.out.println(5 & 3);// 结果为1
        System.out.println(4 & 1);// 结果为0
        位异或( ^ )
        第一个操作数的第n位于第二个操作数的第n位 相反，那么结果的第n为也为1，否则为0
        System.out.println(5 ^ 3);//结果为6*/




public class 不用加实现加法运算 {/*
    思路： 3转为二进制为0011 5转为二进制为0101
    给定的数转成二进制后(位异或^)如果相同位不同则为1，相同位相同则为0：目的是将相加后不需要进位的取出；
        (位与&)如果相同位为1，则为1，相同位为0则为零，
    （<<1）然后左移1位：目的是将相加后需要进位的单独取出；
    重复以上2步，直到其中一方全为0，输出结果即可。
 */
    public static int Add(int num1,int num2) {
        if (num2==0) return num1;
        int sum,carrt;
        sum=num1^num2;//超过1就叫进位，保留没进位前的数
        carrt=(num1&num2)<<1;
        return Add(sum,carrt);
    }
    public static void main(String[] args) {
    }
}
