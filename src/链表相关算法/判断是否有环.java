package 链表相关算法;
//判断列表有环可以解决，两个链表是否有公共节点问题
public class 判断是否有环 {
    public static Boolean fundCycle(Node node) {
        if (node==null)return false;
        Node node1=node;
        Node node2=node;
        while (node2!=null&&node2.next!=null){
            node1=node1.next;
            node2=node2.next.next;
            if (node1==node2){
                return true;
            }
        }
        return false;

    }
}
