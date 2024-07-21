package linear.linkedlist._13palindrome_linkedlist_234;

public class Practice1 {
    public static class ListNode {
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

    public static boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        isPalindrome(new ListNode(1, new ListNode(2)));
    }

    // 16ms
}
