//https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static void main(String[] args){
        PalindromeLL p = new PalindromeLL();
        System.out.println(p.isPalindrome(null));
    }

    public boolean isPalindrome(ListNode head){
        return false;
    }
}
