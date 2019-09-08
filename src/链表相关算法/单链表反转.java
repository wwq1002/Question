package 链表相关算法;

public class 单链表反转 {
    public static Node reverseNode(Node node){
        if (node==null){
            return  null;
        }
        Node pre=node;
        Node end=node;
        while (end.next!=null){
            node=end.next;
            end.next=node.next;
            node.next=pre;
            pre=node;
        }
     return pre;

    }

}
