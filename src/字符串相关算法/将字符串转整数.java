package 字符串相关算法;

public class 将字符串转整数 {
    public static int StrToInt(String str) {
        int j = 0;
        int flag = 1;
        int sum = 0;
        if (str.length() == 0 || str == null) return 0;
        if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-')) return 0;
        if (str.charAt(j) == '+') j++;
        if (str.charAt(j) == '-') {
            j++;
            flag = -1;
        }
        for (; j < str.length(); j++){
            if (str.charAt(j) - '0' < 0 || str.charAt(j) - '0' > 9) return 0;
            else sum = sum * 10 + str.charAt(j) - '0';
        }

        return sum * flag;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("4312321"));
    }
}
