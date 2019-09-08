package 一般测试题;

public class 依次打印递增数字 {
    /**
     * 创建三个线程进行分段叠加
     * 每个线程叠加四次
     *
     */
    public static void main(String[] args) {
        new Thread(new Add(1)).start();
        new Thread(new Add(2)).start();
        new Thread(new Add(3)).start();

    }
}
class Add implements Runnable{
    //定义一个线程ID
    private int threadID;
    //需要进行叠加的数字
    private static int printNum = 9;
    //构造方法获取thread的ID
    public Add(int threadID){
        this.threadID = threadID;
    }
    @Override
    public void run() {
        while (printNum  >=0){
            synchronized (Add.class){
                System.out.println("当前的线程是:"+"---->"+threadID+"线程");
               int index = (printNum%3+1);//计算当前线程的数是和要对其操作的数来求得对应
                if(index == threadID){
                        System.out.println("线程"+threadID+":"+(printNum--));
                        if (printNum<0){
                            System.out.println("为0结束！");
                        }
                    Add.class.notifyAll();
                }else {
                    try {
                       Add.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
