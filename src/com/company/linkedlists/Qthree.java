package com.company.linkedlists;

import java.util.ArrayList;
import java.util.List;

/*
* Given a singly linked list with N nodes and a number X.
* The task is to find the node at the given index (X)(1 based index) of linked list.
* */
public class Qthree
{
    private LinkedSingleNode head;
    private int length;
    //a method that receives a head node and the index of node to be removed
    public Integer GetNth(LinkedSingleNode head,int index)
    {
        int count = 1;
        LinkedSingleNode curr = head;
        while(curr != null){
            if(count == index)
            {
                return curr.data;
            }
            count++;
            curr = curr.next;
        }
        return 0;
    }

    public void PopulateList(LinkedSingleNode head)
    {


    }
    public static void main(String[] args){}

}
