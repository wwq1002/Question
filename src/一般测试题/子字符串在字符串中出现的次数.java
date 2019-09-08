package 一般测试题;

public class 子字符串在字符串中出现的次数 {
    public static void main(String[] args) {
        String str = "HelloHello HelloHello World Hello China Hello Tomorrow";
        // 匹配的子串在字符串中的下标
        int index = 0;
        // 计算出现的次数
        int count = 0;
        String findStr = "Hello";
        while((index = str.indexOf(findStr, index)) != -1) {
            System.out.print(str.charAt(index) + " ");
            index += findStr.length();
            count++;
        }
        System.out.println(count);
    }
}
