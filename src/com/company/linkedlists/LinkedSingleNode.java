package com.company.linkedlists;

public class LinkedSingleNode
{
    int data;
    LinkedSingleNode next;
    LinkedSingleNode(int d) {
        data = d;
        next = null;
    }
    LinkedSingleNode(int d,LinkedSingleNode next) {
        data = d;
        next = next;
    }
}
