package 剑指offer;

public class 进制转换 {
    //十六进制十进制转换
    public static void main(String[] args) {
        String str="676563";
        String str3="";
        for (int i = 0; i <str.length() ; i+=2) {
           String str2= str.substring(i,i+2);
            long num=Long.parseLong(str2,16);
            str3+=(char)num;
        }
      /*  long num=Long.parseLong("67",16);//16进制的67转换成十进制
        long num2=Long.parseLong("67",10);//10进制的67转换成67
        long num3=Long.parseLong("001",2);//10进制的67转换成67
        System.out.println(num);
        System.out.println(num2);*/
        System.out.println(str3);

    }
}
