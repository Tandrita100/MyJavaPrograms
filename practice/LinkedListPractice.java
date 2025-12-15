package com.practice;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;

    }

    void AddAtFirst(int value){
        Node Head = new Node(2);
        Node n = new Node(3);
        n.next = Head;
        Head = n;
    }

    void AddAtMiddle(int value){
        Node N1 = new Node(5);
        Node N2 = new Node(6);
        Node N3 = new Node(7);
        Node N4 = new Node(9);
        Node N5 = new Node(10);
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;

        Node N6 = new Node(8);
        Node temp = N1;

        for(int i=0; i<4; i++){
            if(temp.next != null);
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = N6;
        }

    }
}
public class LinkedListPractice {
    public static void main(String[] args){
        Node node = new Node(6);
        node.AddAtFirst(2);
        node.AddAtMiddle(8);
    }
}
