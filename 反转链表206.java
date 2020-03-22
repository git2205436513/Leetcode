/**
 * @author FJC
 * @date 2020/3/22-10:48
 */

/*
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 */
class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int x) { val = x; }
}
public class 反转链表206 {
    public ListNode reverseList(ListNode head) {
        // 递归实现
        //如果为空 或下一个为空不需要递归直接返回
        if(head == null || head.next == null){
            return  head;
        }
        // 递归实现  我们以1->2->3->4->5->NULL 为例
        //递归最后一层5 因为不满足if直接返回 此时p=5
        ListNode p = reverseList(head.next);
        // 此时head为 4 4—>5->null
        // 这条语句使 head为 4->5->4 p为 5->4
        head.next.next = head;
        //这条语句斩断head中4->5的连接 此时head为4->null p为 5->4
        head.next = null;
        //返回p 继续上一层的反转
        return p;
    }

}
