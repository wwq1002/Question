package 链表相关算法;
/**
 * 此题可应用于上一题类似的思想。也是设置两个指针，只不过这里是，两个指针同时向前走，
 * 前面的指针每次走两步，后面的指针每次走一步，
 * 前面的指针走到最后一个结点时，后面的指针所指结点就是中间结点，
 * 即第（n/2+1）个结点。注意链表为空，链表结点个数为1和2的情况。时间复杂度O（n
 *
 **/

/**
 * 当判断有环时，也是此解法，当二者相遇时，一定有环。
 */
public class 查找单链表的中间结点 {
    public static Node getMiddleNode(Node head) {
        if (head==null||head.next==null){
            return  head;
        }
        Node node1=head;
        Node node2=head;
        while (node2.next!=null){
            node2=node2.next;
            node1=node1.next;
            if (node2.next!=null){
                node2=node2.next;
            }
        }
        return  node1;
    }
}
