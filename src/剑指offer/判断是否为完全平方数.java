package 剑指offer;
/*此题其实就是判断num能否被开平方且结果是整数。如1,4,9,16,25，36等，这些数字都是可以,。同样，我们可以观察一组奇数之和：

        1 = 1

        1+3 = 4

        1+3+5 = 9

        1+3+5+7 = 16

        1+3+5+7+9 = 25

        1+3+5+7+9+11 = 36

        n个奇数（1,3,5,7，...）之和等于n的平方，其中n大于0。

        对此，我们可以对num做减法，每次减去一个奇数，最后判断是否等于0。*/
public class 判断是否为完全平方数 {
    public boolean isPerfectSquare(int num){
        int i=1;
        while (num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}
