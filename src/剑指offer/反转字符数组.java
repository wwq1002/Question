package 剑指offer;

public class 反转字符数组 {
    public static String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        for (int j =a.length-1;j >=0 ; j--) {
            o.append(a[j]).append(" ");
        }
        return o.toString().trim();

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(ReverseSentence("student. a am I"));
    }


}
