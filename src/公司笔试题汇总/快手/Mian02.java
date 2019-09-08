package 公司笔试题汇总.快手;

public class Mian02 {
    public boolean isHappy(int n) {
        // Write your code here
        if(n==1){
            return true;
        }
        if(n<1){
            return false;
        }
        int count=0;
        while(n!=1){
            String s=n+"";
            char []arr=s.toCharArray();
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=Integer.parseInt(arr[i]+"")*Integer.parseInt(arr[i]+"");
            }
            n=sum;
            count++;
            if(count>1000){
                return false;
            }
        }
        return true;
    }


}
