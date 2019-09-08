package 一般测试题;

public class 多线程对同一个数进行操作 {

    int j=10;

    public static void main(String[] args) {
        多线程对同一个数进行操作 ab=new 多线程对同一个数进行操作();
      //  Add a=ab.new Add();
        Sub b=ab.new Sub();
     //   Thread t1=new Thread(a);
       // Thread t2=new Thread(a);
        Thread t3=new Thread(b);
        Thread t4=new Thread(b);
        Thread t5=new Thread(b);

      /*  t1.start();
        t2.start();*/
        t3.start();
        t4.start();
        t5.start();

    }
    private synchronized  void sub() {
        j--;
        if (j>=0){
            System.out.println(Thread.currentThread().getName()+"sub:"+j);
        }else {
            return;
        }
    }

    class Sub implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <1 ; i++) {
                sub();
            }

        }
    }
    /*public  synchronized void add() {
        j++;
        System.out.println(Thread.currentThread().getName()+"add:"+j);
    }
     class Add implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                add();
            }
        }


    }*/

}

