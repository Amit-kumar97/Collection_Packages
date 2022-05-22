package LeetCode.NewUser;

/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

public class MiddleLinkedList {

    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode()
        {}
        ListNode(int val)
        {
            this.val = val;
        }
        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int n = 0;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }

        if(n%2==0)
        {
            temp = head;
            for(int i=0; i<n/2; i++)
                temp = temp.next;
        }
        else{
            temp = head;
            for(int i=0; i<n/2; i++)
                temp = temp.next;
        }
        return temp;
    }
}
