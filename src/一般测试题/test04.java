package 一般测试题;

import java.util.HashSet;
import java.util.Set;

public class test04 {
    public static void main(String[] args) {

        Set set = new HashSet();

        for (int i = 0; i < 10; i++) {
            Object object = new Object();
            set.add(object);

            // 设置为空，这对象我不再用了
            object = null;
        }

        // 但是set集合中还维护这obj的引用，gc不会回收object对象
        System.out.println(set);
    }
}
