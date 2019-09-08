package 剑指offer;

public class 整数二进制有多少个1 {
    public int NumberOf1(int n) {
        int count=0;
        int flag=1;
        if (n==0)return count;
        while (flag!=0){
            if ((n&flag)!=0){count++;};
            flag=flag<<1;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
