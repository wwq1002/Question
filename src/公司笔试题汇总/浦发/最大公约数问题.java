package 公司笔试题汇总.浦发;

public class 最大公约数问题 {
    //求取最大的公约数
    public  static  int getMaxDiver(int x,int y){
        while (x!=y){
            if (x>y)x=x-y;
            else y=y-x;
        }
        return  x;
    }
    //求取最小公倍数

    public static  int getCommonmulitple(int x,int y){
        //求得最小公倍数
        return x*y/getMaxDiver(x,y);

    }
}
