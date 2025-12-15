package com.learningJava;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    void addAtStart(int value) {
        Node head = new Node(3);
        Node n = new Node(7);
        n.next = head;
        head = n;
    }

//    void addAtMiddle(int value) {
//        Node n1 = new Node(3);
//        Node n2 = new Node(7);
//        n1.next = n2;
//
//        Node n3 = new Node(5);
//        n3.next = n2;
//        n1.next = n3;
//
//    }

    void addAtMiddle(int value){
        Node n1 = new Node(3);
        Node n2 = new Node(7);
        Node n3 = new Node(8);
        Node n4 = new Node(9);
        Node n5 = new Node(11);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node n6 = new Node(6);
        Node temp = n1;

        for(int i=0; i<4; i++){
            if(temp.next != null){
                temp = temp.next;
            }
        }
        if(temp.next == null){
            temp.next = n6;
        }

    }

}

    public class LinkedListTest {

        public static void main(String[] args) {
            LinkedListTest lt = new LinkedListTest();
            Node node = new Node(7);
            node.addAtStart(2);
            node.addAtMiddle(6);

        }
    }
