package 一般测试题;

public class TryCatch03 {
    /**
     * 主要方法
     */
    public static void main(String[] args) {
        // 调用 测试方法
        // 打印 测试方法返回的结果
        System.out.println(Stringget());
    }

    public static String Stringget(){
        String a="111";
        try {
            System.out.println("try……");

            return a;

        } catch (Exception e) {
            System.out.println("catch……");
        } finally {
            a=a+"222";//学过java的都知道，这里是重新新生成一个String,所以不影响try的a值。
            System.out.println("finally……");
        }

        return a;
    }


}
