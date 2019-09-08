package 链表相关算法;

public class 判断有环情况下的入口点 {
    public static Node fundCycle(Node node) {
        if (node==null) return null;
        Node node1=node;
        Node node2=node;
        while (node2!=null&&node2.next!=null){
            node1=node1.next;
            node2=node2.next.next;
            if (node1==node2){
                node1=node;
                while (node1!=node2){
                    node1=node1.next;
                    node2=node2.next;
                }
                if (node1==node2)return node1;
            }
        }
        return null;

    }
}
