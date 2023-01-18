package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicated_List {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (true) {
            if (node == null || node.next == null) {
                break;
            }
            if (node.val == node.next.val) {
                if (node.next.next == null) {
                    node.next = null;
                    break;
                }
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }
}

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
