package 链表相关算法;

/**
 * 合并有序的单链表
 */
public class 合并单链表 {
    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    public static Node mergeList(Node list1, Node list2) {
       if (list1==null&&list2==null)return null;
       if (list1!=null&&list2==null)return list1;
       if (list2!=null&&list1==null)return list2;
       Node node;
        if (list1.val<list2.val){
            node=list1;
            list1.next=list1;
        }else {
            node=list2;
            list2.next=list2;
        }
        node.next=mergeList(list1,list2);
        return node;
    }
}
