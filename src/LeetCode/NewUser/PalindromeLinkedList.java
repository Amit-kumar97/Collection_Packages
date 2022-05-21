package LeetCode.NewUser;

import java.util.Scanner;
import java.util.Stack;

/*
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:

Input: head = [1,2,2,1]
Output: true

Example 2:

Input: head = [1,2]
Output: false
 */

public class PalindromeLinkedList {

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    static Node head;
    public static boolean checkPalindrome(Node head)
    {
        boolean res = false;
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }
        while(head!=null)
        {
            if(head.data==st.pop())
                res = true;
            else
            {
                res = false;
                break;
            }
            head = head.next;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0)
        {
            head.data = sc.nextInt();
            head = head.next;
            n--;
        }
        System.out.println(checkPalindrome(head));

    }
}
