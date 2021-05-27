package com.company.linkedlists;

public class Qfour
{
    int getMiddle(LinkedSingleNode head)
    {
        LinkedSingleNode slow = head;
        LinkedSingleNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
