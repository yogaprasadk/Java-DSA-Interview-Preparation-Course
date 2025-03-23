package com.yogaprasad;

import Linkedlist.com.yogaprasad.CLL;

public class Main {
    public static void main(String[] args) {
//       // insert at first,middle,last
//       SingleLL ID = new SingleLL();
//       ID.insertfirst(3);
//       ID.insertfirst(4);
//       ID.insertfirst(5);
//       ID.insertfirst(6);
//       ID.insert(56,3);
//       ID.insertLast(99);
//       ID.display();
//
//       //delete at first,middle,last
//        //delete at first
//        System.out.println(ID.deletefirst());
//        ID.display();
//        // delete at last
//        System.out.println(ID.deletelast());
//        ID.display();
//        // delete at any index
//        System.out.println(ID.deleteindex(0));
//        ID.display();
//
//        //find the value
//        System.out.println(ID.find(4));
//        ID.display();

        //Double Linked List
//        DLL LL = new DLL();
//        LL.insertfirst(3);
//        LL.insertfirst(1);
//        LL.insertfirst(5);
//        LL.insertfirst(2);
//        LL.insertlast(99);
//        LL.insert(3,6);
//        LL.display();

        // circular Linked list
        CLL list = new CLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.display();
        list.delete(2);
        list.display();
    }
}
