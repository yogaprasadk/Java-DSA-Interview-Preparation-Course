package com.yogaprasad;

public class DLL {
    // node head
    Node head;

    // insert first
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        // check for null pointer exception
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    // insert at last
    public void insertlast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        //move to end
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // insert a node after that node is given to you
    public void insert(int after,int val){
        Node p  = find(after);

        if(p == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.prev.next = node;
        }
    }


//    // node display
//    public void display(){
//        Node node = head;
//        while (node != null){
//            System.out.print(node.val +" -> ");
//            node = node.next;
//        }
//        System.out.println("End");
//    }

    // display as reverse
    public void display(){
        // it will move forwards
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val +" -> ");
            last = node;
            node = node.next;

        }
        System.out.println("End");

        //after forward, the last moves backwards.
        while (last != null){
            System.out.print(last.val+" -> ");
            last =  last.prev;
        }
        System.out.println("Start");
    }

    // structure FOR Double Linked List
    private class Node{
        Node next;
        Node prev;
        int val = 0;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }
    }
}
