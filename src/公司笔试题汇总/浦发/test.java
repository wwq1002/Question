package 公司笔试题汇总.浦发;

public class test {
    public static String uniqueABstr(String stra,String strb){
        String newstr = "";
        for(int i = 0 ; i < stra.length() ; i ++){
            String s = stra.charAt(i) +"";
            if(!strb.contains(s))
                newstr += s;
        }
        return newstr;
    }
    public static void main(String args[]){

        System.out.println(uniqueABstr("1233","2"));

    }
}
