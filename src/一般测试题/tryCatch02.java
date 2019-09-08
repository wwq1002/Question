package 一般测试题;

public class tryCatch02 {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            System.out.println("走到a="+a);
            return a;
            /*
             * return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             *
             */
        } finally {
            a = 40;
            System.out.println("走到a="+a);
            return a; //如果这样，就又重新形成了一条返回路径，由于只能通过1个return返回，所以这里直接返回40
        }

//      return a;
    }

}
