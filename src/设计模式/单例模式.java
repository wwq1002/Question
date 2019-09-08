package 设计模式;
/*
public class 单例模式 {
    //1、懒汉式单例
    public class LazySingleton{
        private static volatile LazySingleton instace=null;
        private LazySingleton(){};
        public static synchronized LazySingleton getInstace(){
            if (instace==null)
                instace=new LazySingleton();
            return instace;
        }

    }
    //2、饿汉式单例
     public class HungrySingleton{
        private static final HungrySingleton instance=new HungrySingleton();
        private HungrySingleton(){}
        public static  HungrySingleton getInstance(){
            return instance;
        }
    }
}
*/