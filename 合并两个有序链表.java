/**
 * @author FJC
 * @date 2020/3/21-23:54
 */

/**
 * 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 使用递归
        //如果l1小 则l1的next和l2比较
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        // 相反同理
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return  l2;
        }
    }

}
