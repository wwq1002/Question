package 一般测试题;

public class 多线程test {
    public static void main(String[] args) {
        Runnable runn=new  MyRunnable();
        Thread thread=new Thread(runn);
        Thread thread2=new Thread(runn);
        thread.start();
        thread2.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main"+"--"+i);
        }

    }
    public static class MyRunnable implements Runnable{


        @Override
        public void run() {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName()+"--"+i);

            }
        }
    }
}
