package Linkedlist.com.yogaprasad;

public class CLL {
     private Node head;
     private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
         Node node = new Node(val);
         // head becomes null
         if(head == null){
             head = node;
             tail = node;
             return;
         }
         tail.next = node;
         node.next = head;
         tail = node;
    }

    //deletion
    public void delete(int val){
        Node node = new Node(val);
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }


    public void display(){
          // one circular need to perform.
          // circular keep on going until reach again
          // it can be obtained by using do while loop
          Node node = head;
          if(head != null){
              do {
                  System.out.print(node.val+" -> ");
                  node = node.next;
              }while (node != head);
          }
        System.out.println("HEAD");
    }

    // structure of Circular Linked List.
     private class Node{
           int val;
           Node next;

         public Node(int val) {
             this.val = val;
         }
     }
}
