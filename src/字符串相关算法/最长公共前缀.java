package 字符串相关算法;

public class 最长公共前缀 {
    public  static String longestCommonPrefix3(String[] strs) {
        if(strs.length==0||strs==null)return "";
        String str=strs[0];
        for (int i = 0; i < strs.length; i++) {
            //当前字符串不符合前缀时
            while (strs[i].indexOf(str)!=0){
                str=str.substring(0,str.length()-1);
                if (str=="")return "";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String[] str={"asdft","asdcgt","asdceqq","asrfx","asdihij"};
        System.out.println(longestCommonPrefix3(str));
    }
}
