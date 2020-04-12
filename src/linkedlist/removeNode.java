package linkedlist;

public class removeNode {
public static void main(String[] args) {
           ListNode head = new ListNode(5);
           ListNode listNode = removeNthFromEnd(head, 2);
        System.out.println(listNode);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode preNode = head;
        ListNode curNode = head;

        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
        }

        if (curNode == null) {
            return preNode.next;
        }

        while (curNode.next != null) {
            preNode = preNode.next;
            curNode = curNode.next;
        }

        preNode.next = preNode.next.next;

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
