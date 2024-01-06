/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
    ArrayList <ListNode> nodes = new ArrayList<>();
    int size = 0;
      
    while (head != null) {
        nodes.add(head);
        head = head.next;
        size += 1;
    }
      
    return nodes.get(size / 2);
  }
}
