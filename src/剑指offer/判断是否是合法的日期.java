package 剑指offer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
给定一个字符串，判断是否是合法的日期
20190804 true
201902031 false
*/
public class 判断是否是合法的日期 {
    public static void isValidDate(String strDate)  {
        SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMdd");
        formatter.setLenient(false);
        Date date= null;
        try {
            date = formatter.parse(strDate);
            System.out.println(true);
        } catch (ParseException e) {
            System.out.println(false);
        }
    }
    public static void main(String[] args) throws ParseException {
        isValidDate("1190228");
    }
}
