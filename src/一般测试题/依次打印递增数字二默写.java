package 一般测试题;

public class 依次打印递增数字二默写 {
    public static void main(String[] args) {
        new Thread(new Add2(1)).start();
        new Thread(new Add2(2)).start();
        new Thread(new Add2(3)).start();
    }
}
class Add2 implements Runnable{
    private int threadID;
    private static int tempnum=9;

    public Add2(int i) {
        this.threadID=i;
    }

    @Override
    public void run() {
        while (tempnum>=0){
            synchronized (Add2.class){
                System.out.println("当前的线程是:"+"---->"+threadID+"线程");
                int index=(tempnum%3+1);
                if (index==threadID){
                    System.out.println("当前的线程是:"+Thread.currentThread().getName()+"数字"+tempnum--);
                    Add2.class.notifyAll();
                }else {
                    try {
                        Add2.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }
}
