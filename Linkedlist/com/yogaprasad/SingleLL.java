package com.yogaprasad;

public class SingleLL {
        // head Pointer
        private Node head;
        // tail pointer
        private Node tail;

        // size of LL
        private int size;

        public SingleLL(){
            this.size = 0;
        }

        // insert node at element first
        public void insertfirst(int val){
            Node newnode = new Node(val);
            // the head is point at next element so assign the new node as point to head
            newnode.next = head;
            // head will be at new node
            head = newnode;

            //if there is only one element in the list the tail will point at head
            if (tail == null){
                tail = head;
            }
            size++;
        }

        public void insertLast(int val){
            // if tail becomes null or no element is present at last or if there is one element in a list
            if(tail == null){
                insertfirst(val);
                return;
            }
            //New Node
            Node node = new Node(val);
            // tail will need to be point to new node
            tail.next = node;
            // now tail is at new node.
            tail = node;
            size++;
        }
        // insert element at nth position or nth index
        public void insert(int val,int index){
              // if index value is 0; then insert at first.
              if (index == 0){
                  insertfirst(val);
                  return;
              }
              // if index value is equal to size,then insert at last.
              if(index == size){
                  insertLast(val);
                  return;
              }

              // if index value at need as required position

              // start from  first position
              Node temp = head;  // now here Node is pointed at 0th index.

              // run until the node to the required index
             for (int i = 1; i < index; i++) { // 1 because node is at 0th index
                 temp = temp.next;
             }

             // New Node
             Node node = new Node(val,temp.next);
             temp.next = node;
             size++;
        }

        // delete element at first
        public int deletefirst(){
          int val = head.value;
          head = head.next;
           if(head == null){
            tail = null;
           }
           size--;
           return val;
        }

        // get index
        public Node get(int index){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
        // delete last
        public int deletelast(){
            if(size <= 1){
                return deletefirst();
            }

            Node secondlast = get(size - 2);
            int val = tail.value;
            tail = secondlast;
            tail.next = null;
            return val;
        }

        // delete index
        public int deleteindex(int index){
            if(index == 0){
                return deletefirst();
            }
            if (index == size - 1){
                return deletelast();
            }
            //traverse up to the target to the previous
            Node prev = get(index - 1);
            // delete element
            int val = prev.next.value;
            // prev element to point to delete of next element
            prev.next = prev.next.next;
            return val;
        }

        // find the value and return the node.
        public Node find(int value){
            Node node = head;
            while (node != null){
                if (node.value == value){
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        //display
        public void display(){
            // here we used temp Node because we don't want to change the structure of linkedList.
            // if we use head it will lead change the structure of LinkedList.
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }

        // Node Structure
        private class Node{
            private int value;
            private Node next;

            // assign value
            public Node(int value){
                this.value = value;
            }

            // assigned value and point to next node
            public Node(int value, Node next){
                //assigned value
                this.value = value;
                //pointing to next Node
                this.next = next;
            }
        }
    }
