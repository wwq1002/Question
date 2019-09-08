package 剑指offer;

public class 替换空格 {
    public static void main(String[] args) {
        String str="";
        替换空格 newobject=new 替换空格();
        String strarr="we|are|happy";
        StringBuffer stringBufferone=new StringBuffer(strarr);
        String acc=replaceSpace(stringBufferone);
        System.out.println(acc);
        String acc2=replaceSpace2(new StringBuffer(acc));
        System.out.println(acc2);

    }

    private static String replaceSpace2(StringBuffer stringBuffer) {
        return stringBuffer.toString().replaceAll("%20", " ");
    }

    public static String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\|", "%20");
    }

}
