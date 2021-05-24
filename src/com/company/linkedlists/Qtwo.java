package com.company.linkedlists;

public class Qtwo
{
    public int lengthLinkedList(LinkedSingleNode head)
    {
        //check if the linked list is null
        if(head == null )
        {
            return 0;
        }
        else
            {
                int i = 0;
                while(head != null)
                {
                    i++;
                    head = head.next;
                }
                return i;
            }

    }
}
