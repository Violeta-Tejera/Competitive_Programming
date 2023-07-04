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
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int value = 0;
        int msb_power = list.size() - 1;
        int power = msb_power;

        for(int i = 0; i <= msb_power; i++){
            value += Math.pow(2, power) * list.get(i);
            power--;
        }

        return value;
    }
}
