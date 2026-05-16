
//Singly linkedlist 

import java.util.*;
class CreateLinkedList{

    public Node head;

    public static void main(String arg[])
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        CreateLinkedList list = new CreateLinkedList();

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;

        PrintLinkedList.display(list.head);
    }
}