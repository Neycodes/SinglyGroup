package com.nicoo;/*
Activity 3: Implementation of Singly Linked Lists
ESTRELLA, PITT GREGORI
LLOSA, EDUARDO DOMINICO
CC 13.1 B - DATA STRUCTURES AND ALGORITHMS
*/

import java.util.Scanner;

    public class Main {
        static int dNode =0;
        static Scanner read = new Scanner(System.in);
        static LinkedList list = new LinkedList();
        public static void main(String[] args) {
            Prompt();
        }
        static void Prompt(){
            boolean isExit = false;
            while (!isExit) {
                Print();
                int choice = read.nextInt();
                switch (choice) {
                    case 0: {
                        isExit = true;
                        System.out.println("Now exiting!!");
                        Exit();
                    }
                    case 1: {
                        System.out.print("Add value to the head: ");
                        int iNode = read.nextInt();
                        list.insertFirst(iNode);
                        System.out.println(iNode + " node added to the Head successfully");
                        break;
                    }
                    case 2: {
                        System.out.print("Add value to the tail: ");
                        int node = read.nextInt();
                        list.insertNode(node);
                        System.out.println(node + " node added to the tail successfully");
                        break;
                    }
                    case 3: {
                        list.deleteFirstNode();
                        System.out.println("Head is deleted");
                        System.out.println("Current list");
                        list.printNodes();
                        break;
                    }
                    case 4: {
                        System.out.println("Tail is deleted");
                        list.deleteLastNode();
                        System.out.println("Current list");
                        list.printNodes();
                        break;
                    }
                    case 5: {
                        System.out.print("Find value in the list: ");
                        int node = read.nextInt();
                        list.findNode(node);
                        break;
                    }
                    case 6: {
                        System.out.print("Delete a specific value in the list: ");
                        list.deleteNthNode(dNode = read.nextInt());
                        break;
                    }
                    case 7: {
                        list.printNodes();
                        break;
                    }
                }
            }

        }
        static void Exit(){
            System.exit(69);
        }
        static void Print(){
            System.out.println(" 0 - Exit\n 1 - Add to head\n 2 - Add to tail \n " +
                    "3 - Delete from head \n 4 - Delete from tail \n 5 - Is in list \n 6 - Delete a value \n 7 - Print all");
        }
    }

