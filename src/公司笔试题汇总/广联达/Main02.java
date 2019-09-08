package 公司笔试题汇总.广联达;

import 链表相关算法.Node;

import java.util.HashMap;

public class Main02 {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }

    public static String  EntryNodeOfLoop(ListNode pHead)
    {
        HashMap<ListNode, Integer> first=new HashMap<>();
        ListNode pListNode=pHead;
        while (pListNode!=null) {
            if (!first.containsKey(pListNode)) {
                first.put(pListNode, 1);
            }else {
                if (pListNode.next==null) {
                    return "tail connects to node index 0";
                }
                return "tail connects to node index "+pListNode.val;
            }
            pListNode=pListNode.next;

        }
       return  "no cycle";
    }

    public static void main(String[] args) {

    }

}
