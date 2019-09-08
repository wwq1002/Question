package 排序和查找算法;

public class 二分查找 {
    public static int  halfSearch(int[] array,int target) {
        int i=0;
        int j=array.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if (array[mid]==target)
                return mid+1;
            if (array[mid]>target)
                j=mid-1;
            if (array[mid]<target)
                i=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a= {3,9,7,5,4,15,6,2,0};
        System.out.println(halfSearch(a,3));
    }
}
