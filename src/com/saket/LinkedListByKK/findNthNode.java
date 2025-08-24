package com.saket.LinkedListByKK;

import java.util.LinkedList;

public class findNthNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this. data = data;
        }
    }


    public static void main(String[] args) {
        LinkedList<Node> list = new LinkedList();
       // list.add(new Node(1));
        Node head = new Node(1);
        list.add(head);
        head.next = new Node(2);
        list.add(head.next);
        head.next.next = new Node(3);
        list.add(head.next.next);
        head.next.next.next = new Node(4);
        list.add(head.next.next.next);
        head.next.next.next.next = new Node(5);


//        Node a = head;
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//        Node h = new Node(8);
//        Node i = new Node(9);
//        Node j = new Node(10);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
//        g.next = h;
//        h.next = i;
//        i.next = j;
        Node p = nthNode(head,2);
        System.out.println(p.data);

    }

    public static Node nthNode(Node head, int n)
    {
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp = head;
        for(int i = 1; i<m;i++){
            temp = temp.next;

        }
        return temp;

    }
}
