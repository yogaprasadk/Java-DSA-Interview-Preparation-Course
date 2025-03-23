 package com.yogaprasad;

public class StructureofLinkedlist
{
        // head Pointer
        private Node head;
        // tail pointer
        private Node tail;

        // size of LL
        private int size;

        public StructureofLinkedlist(){
            this.size = 0;
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
            public Node(int value,Node next){
                //assigned value
                this.value = value;
                //pointing to next Node
                this.next = next;
            }
        }
}