package 一般测试题;

public class 引用问题 {
    public static void main(String[] args) {
     /*   Integer a =new Integer(3);
        Integer b=a;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        b=3;
        System.out.println(a.equals(b));
        System.out.println(a==b);*/
        System.out.println("1+##############");
        Float a=2.2f;
        Float b=2.2f;
        System.out.println(a.equals(2.2));
        System.out.println(a.equals(2.2f));
        System.out.println("new!");
        System.out.println(a==b);
        System.out.println(a.equals(2.20));
        System.out.println(a.equals(3.3));
        System.out.println(b.equals(3.30f));
        System.out.println("2+##############");
        Integer c=3;
        Integer d=3;
        System.out.println(c.equals(3));
        System.out.println(c.equals(d));
        System.out.println(c==d);
        System.out.println("3+##############");
        Integer e=128;
        Integer f=128;
        System.out.println(e.equals(128));
        System.out.println(e.equals(f));
        System.out.println(e==f);


    }
}
