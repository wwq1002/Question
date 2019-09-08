package 剑指offer;

public class 构建B数组由A数据组连乘 {
    public int[] multiply(int[] arr){
        int len=arr.length;
        int[] B=new int[len];
        B[0]=1;
        for (int i = 1; i < B.length; i++) {
           B[i]=B[i-1]*arr[i-1];
        }
        int temp=1;
        for (int i = arr.length-2; i >=0; i--) {
            temp*=arr[i+1];
            B[i]*=temp;
        }
        return B;
    }
    public static void main(String[] args) {

    }
}
