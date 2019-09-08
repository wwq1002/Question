package 公司笔试题汇总.科大讯飞;

public class Main02 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        String str=sc.next();*/
        String str="{11,13,15,17,19,21}";
        String str2=str.substring(1,str.length()-1);
        String[] str3=str2.split(",");
        int[] arr=new int[str3.length];
        for (int i = 0; i <str3.length ; i++) {
            arr[i]=Integer.parseInt(str3[i]);
        }
        System.out.println(BinarySearch(arr,19,0,str3.length)+1);




    }

    public static int BinarySearch(int a[],int k,int low,int heigh){
        int mid=(low+heigh)/2;
        if (low>heigh) return -1;
        if (low<=heigh){
            if (a[mid]==k){
                return mid;
            }else if (a[mid]>k){
                return  BinarySearch(a,k,low,mid-1);
            }else {
               return  BinarySearch(a,k,mid+1,heigh);
            }

        }else{
           return -1;
        }


    }

}
