package 剑指offer;
/*给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
        k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
        示例 :
        给定这个链表：1->2->3->4->5
        当 k = 2 时，应当返回: 2->1->4->3->5
        当 k = 3 时，应当返回: 3->2->1->4->5*/
class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;

    }

}
public class 链表K节点反转 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        //获取长度
        int len = getLength(head);
        //t表示可以逆转几组
        int t = len/k;
        //定义虚拟头结点
        ListNode dummy = new ListNode(-1);
        //定义sign标记结点
        ListNode sign = dummy;
        dummy.next = head;
        ListNode f = head;
        ListNode s = f.next;
        while(t>0){
            int m = k;
            //三指针逆转
            while(m>1&&f!=null){
                f.next = s.next;
                s.next = sign.next;
                sign.next = s;
                s = f.next;
                m--;
            }
            //让sign指向当前f
            sign = f;
            //f指向当前s
            f = s;
            //判断f是否为空，为空直接返回
            if(f == null) break;
            //s指向s.next
            s = s.next;
            //逆转次数减一
            t--;
        }
        return dummy.next;
    }

    public static int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }
}
