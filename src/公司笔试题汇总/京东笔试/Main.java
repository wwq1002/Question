package 公司笔试题汇总.京东笔试;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] height=new int[N];
        for (int i = 0; i < N; i++) {
            height[i]=scanner.nextInt();
        }
        Main main=new Main();
        int[] arrayLenUp=main.getLISUp(height);
        int[] arrayLenDown=main.getLISDown(height);
        int total=2;
        int temp;
        for (int i = 0; i < N; i++) { //对应求和找到最大的那个
            temp=arrayLenUp[i]+arrayLenDown[N-1-i];
            if (temp>total) {
                total=temp;
            }
        }
        System.out.println((N-total+1)); //输出最终结果
        scanner.close();

    }

    public int binarySearchPosition(int arrayOut[],int left,int right,int key){ //二分查找要替换的位置

        int mid;

        if (arrayOut[right]<key) {
            return right+1;
        }else {
            while(left<right){
                mid=(left+right)>>>1;
                if (arrayOut[mid]<key) {
                    left=mid+1;
                }else {
                    right=mid;
                }
            }
            return left;
        }

    }

    public int[] getLISUp(int[] arrayIn){ //获取最长递增子序列并把它们保存在数组arrayLen中

        int len=1;
        int position;
        int[] arrayOut=new int[arrayIn.length+1];
        arrayOut[1]=arrayIn[0];
        int[] arrayLen=new int[arrayIn.length];
        arrayLen[0]=1;
        for (int i = 1; i < arrayIn.length; i++) {
            position=binarySearchPosition(arrayOut, 1, len, arrayIn[i]);
            arrayOut[position]=arrayIn[i];
            if (position>len) {
                len=position;
            }
            arrayLen[i]=position;
        }
        return arrayLen;
    }

    public int[] getLISDown(int[] arrayIn){ ////获取最长递减子序列并把它们保存在数组arrayLen中
        int[] arrayReverse=new int[arrayIn.length];
        int[] arrayLen=new int[arrayIn.length];
        for (int i = 0; i < arrayReverse.length; i++) { //将最长递减子序列问题转换为最长递增子序列问题
            arrayReverse[i]=arrayIn[arrayIn.length-1-i];
        }
        arrayLen=getLISUp(arrayReverse);
        return arrayLen;
    }

}
