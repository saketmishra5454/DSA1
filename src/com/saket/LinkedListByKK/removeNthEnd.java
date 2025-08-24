package com.saket.LinkedListByKK;

import java.util.LinkedList;

public class removeNthEnd {
    public static class Node{
        int data;
        Node next;

    Node(int data) {
        this.data = data;
    }
    }
    public static Node removeNthFromEnd(Node head, int n){
        if(head == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        for(int i = 0; i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data);
            if(temp.next != null) System.out.print("->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       // LinkedList<Node> list = new LinkedList();
        Node a = new Node(12);
        Node b = new Node(113);
        Node c = new Node(222);
        Node d = new Node(35);
        Node e = new Node(40);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //list.add(a);
        Node res = removeNthFromEnd(a,6);
        display(res);
    }
}
