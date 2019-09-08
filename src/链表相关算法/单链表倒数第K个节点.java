package 链表相关算法;

public class 单链表倒数第K个节点 {
    /*
     * 主要思路就是使用两个指针，先让前面的指针走到正向第k个结点
     * 这样前后两个指针的距离差是k-1，之后前后两个指针一起向前走
     * 前面的指针走到最后一个结点时，后面指针所指结点就是倒数第k个结点
     */
    public static Node reGetKthNodePointer(Node head, int k){
        if (k<=0)return null;
        if(head==null) return null;
        Node node1=head;
        Node node2=head;
        int count=1;
        while (node2.next!=null){
            if (count>=k){
                node1=node1.next;
            }
            node2=node2.next;
            count++;
        }
        if (count<k){
            return null;
        }
        return  node1;
    }
}
