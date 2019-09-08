package 剑指offer;
/*题目：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
        重复的结点不保留，返回链表头指针。
        例如，链表1->2->3->3->4->4->5 处理后为 1->2->5*/
public class 链表去掉重复点 {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode deleteDuplication_2(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode node = new ListNode(pHead.val - 1);
        ListNode pre = node;
        node.next = pHead;
        ListNode cur = pHead;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                int val = cur.val;
                while (cur != null && cur.val == val) {
                    cur = cur.next;
                }
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }


        }
        return pre.next;

    }
}
