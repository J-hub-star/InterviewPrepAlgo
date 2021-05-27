package com.company.linkedlists;

public class Qone
{
    public void printList(LinkedSingleNode head)
    {
        while(head.next != null && head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args)
    {

    }
}
