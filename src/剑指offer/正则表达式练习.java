package 剑指offer;
/*

请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
        * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
        * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
*/


//+一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
//* 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
//? 零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。

public class 正则表达式练习 {
    public boolean isNumeric(char[] str) {
        if (str==null||str.length==0)return false;
        String match="[-+]?[0-9]+(\\.[0-9]*)?([eE][+-]?[0-9]+)?";
        return new String(str).matches(match);


    }
}
