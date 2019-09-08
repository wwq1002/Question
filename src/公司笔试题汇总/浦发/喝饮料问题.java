package 公司笔试题汇总.浦发;/*
喝饮料问题，一块钱一瓶饮料，两个空瓶子换一瓶饮料
        求4块钱能和多少饮料*/
public class 喝饮料问题 {
    public static int Drink(int num){
        int moeny=num;
        int ping=0;
        int kongping=0;
        while (moeny>0){
            moeny--;
            ping++;
            kongping++;
            if (kongping==2){
                ping++;
                kongping=1;


            }
        }
        if (kongping==2)
            ping++;
        return ping;
    }
}
