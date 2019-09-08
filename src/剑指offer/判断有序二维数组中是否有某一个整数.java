package 剑指offer;

public class 判断有序二维数组中是否有某一个整数 {
    public static boolean Find(int target, int[][] array) {/*从左到右递增，从上到下递增*/
        if (array == null && array.length == 0) return false;
        int h = array.length;
        int s = array[0].length - 1;
        for (int i = 0; i < h; i++) {
            int low = 0;
            int high = s;
            int mid = 0;/*重点位置的下标*/
            while (low <= high) {
                mid = (low + high) / 2;
                if (target == array[i][mid]) return true;
                if (target < array[i][mid]) high = mid - 1;
                else low = mid + 1;
            }
        }
        return false;
    }

    public static boolean Find02(int target, int[][] array) {/*从左到右递增，从上到下递增*/
        if (array == null && array.length == 0) return false;
        int h = array.length;
        int s = array[0].length - 1;
        int i = 0;
        int j = s;
        while (i < h && j >= 0) {
            if (target == array[i][j]) return true;
            if (target < array[i][j]) {
                j--;
            } else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]
        //[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find02(19, array));
    }
}
