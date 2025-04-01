// Leetcode Problem : 83
// Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Q83 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode T = head;

        while (T != null && T.next != null) {
            if (T.val == T.next.val) {
                T.next = T.next.next;

            } else {
                T = T.next;
            }
        }
        return head;
    }
}
