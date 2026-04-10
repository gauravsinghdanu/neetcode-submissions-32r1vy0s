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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int n=0,m=0;
        ListNode temp1=list1 , temp2=list2;

        while(temp1!=null){
            n++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            m++;
            temp2=temp2.next;
        }
        int[] arr=new int[n+m];
        int i=0;

        while(list1!=null){
            arr[i++]=list1.val;
            list1=list1.next;
        }
        while(list2!=null){
            arr[i++]=list2.val;
            list2=list2.next;
        }
        Arrays.sort(arr);

        ListNode head = new ListNode(-1);
        ListNode curr = head;

        for(int val:arr){
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return head.next;
        
    }
}