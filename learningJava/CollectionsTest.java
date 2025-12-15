package com.learningJava;

import java .util.*;

public class CollectionsTest {
    public static void main(String[] args){

        List l = new ArrayList();
        l.add(1);
        l.add(43);
        System.out.println(l);

        ArrayList al = new ArrayList();
        al.add(34);
        al.add(11);
        al.add(786);
        System.out.println(al);

        System.out.println(l.toString());
        System.out.println(al.toString());

        Set s = new HashSet();
        s.add(14);
        s.add(54);
        s.add(2);
        s.add(14);
        System.out.println(s);


    }
}


/*
package com.learningJava;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    void addAtStart(int value){
       // Node head = new Node(3);
        Node n = new Node(7);
        n.next = this.next;
        this.next = n;
        // n.next = head;
       // head = n;
    }

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

//     n1(3)->n2(7)->n3(8)->n4(8)->n5(11)

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


//        Node n3 = new Node(5);
//        n3.next = n2;
//        n1.next = n3;



    }
}

public class LinkedListTest {

    public static void main(String[] args){
        LinkedListTest lt = new LinkedListTest();



    }
}

 */