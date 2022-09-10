package com.nicoo;

public class LinkedList {
        private int size;
        private Node head;

        public LinkedList() {
            this.size = 0;
            this.head = null;
        }

        public void insertNode(int item) {
            Node node = new Node();
            node.item = item;
            Node current = this.head;

            if (this.head == null) {
                this.head = node;
                this.head.next = null;
                this.size = 1;
                System.out.println(this.head);
            } else {

                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
                node.next = null;
                this.size += 1;
            }
        }

// Adds node
        public void insertFirst(int item) {
            Node node = new Node();
            node.item = item;
            node.next = this.head;
            this.head = node;
            this.size++;
        }



//     Deletes the first node
        public void deleteFirstNode() {
            if (head != null) {
                this.head = this.head.next;
                this.size--;
            } else {
                System.out.println("Linked list is empty");
            }
        }

//     Deletes the last node
        public void deleteLastNode() {
            Node currentNode = this.head;
            if (size == 1) {
                head = null;
                size = 0;
            } else {
                Node previousNode = null;
                while (currentNode.next != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }
                previousNode.next = null;
                this.size--;
            }
        }

//       Deletes a specific Node location
        public void deleteNthNode(int position) {
            if (position <= this.size && this.head != null) {
                Node currentNode = this.head;
                Node prevNode = null;
                for (int i = 0; i < position; i++) {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
                prevNode.next = currentNode.next;
                this.size--;
            } else {
                System.out.println("No node exists at Position: " + position);
            }
        }


//          Find if the node exist in the list

        public void findNode(int item) {
            Node node = this.head;
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (node.item.equals(item)) {
                    System.out.println("Node " + item + " -> position " + i + " in the list");
                    found = true;
                }
                node = node.next;
            }

            if (!found)
                System.out.println("Item " + item + " was not found in list");
        }

// Prints the entire node list
        public void printNodes() {
            if (this.size < 1)
                System.out.println("The Linked List is Empty");
            else {
                System.out.println("Values in list: " );
                System.out.println("========================");
                Node current = this.head;
                for (int i = 0; i < this.size; i++) {

                    System.out.println("| Node " + current.item + " -> position " + i + " |");
                    current = current.next;
                }
                System.out.println("========================");
            }
        }

    }

