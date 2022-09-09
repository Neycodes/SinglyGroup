package com.nicoo;

import java.util.Scanner;

public class Main {
    static int dNode =0;
    static Scanner read = new Scanner(System.in);
    static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        Choices();
//        LinkedList list = new LinkedList();

     /*   list.insertNode("test1");
        list.insertNode("test2");
        list.insertNode("test3");
        list.insertNode("test4");
        list.insertNode("test5");
        list.insertNode("test6");
        list.insertNode("test7");
        list.printNodes();

        System.out.println();

        System.out.println("Finding item test2 in the Linked list");
        list.findNode("test2");
        System.out.println("Finding item nonExist in the Lineked list");
        list.findNode("nonExist");

        System.out.println();

        System.out.println("Finding item at location 4");
        list.findNodeAt(4);

        System.out.println();
        System.out.println("Finding item at last location ");
        list.findLastNode();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding test1st at start of the Node");
        list.insertFirst("test1st");
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding testNth at 2nd Location");
        list.insertNth("testNth", 2);
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting first node");
        list.deleteFirstNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting last node");
        list.deleteLastNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting node from 4th location");
        list.deleteNthNode(4);
        list.printNodes();*/
    }
    static void Choices(){
        boolean isExit = false;

        while (!isExit) {
            Print();
            int choice = read.nextInt();
            switch (choice) {
                case 0: {
                    isExit = true;
                    System.out.println("exiting..");
                    Exit();

                }
                case 1: {
                    String iNode = read.next();
                    list.insertFirst(iNode);
                    break;
                }
                case 2: {
                    String node = read.nextLine();
                    list.insertNode(node);
                    break;
                }
                case 3: {
                    list.deleteFirstNode();
                    break;
                }
                case 4: {
                    list.deleteLastNode();
                    break;
                }
                case 5: {
                    String node = read.nextLine();
                    list.findNode(node);
                    break;
                }
                case 6: {
                    list.deleteNthNode(dNode = read.nextInt());
                    break;
                }
                case 7: {
                    list.printNodes();
                    return;
                }
            }
        }

    }
    static void Exit(){
        System.exit(2123123);
    }
    static void Print(){
        System.out.println(" 0 - Exit\n 1 - Add to head\n 2 - Add to tail \n " +
                "3 - Delete from head \n 4 - Delete from tail \n 5 - Is in list \n 6 - Delete a value \n 7 - Print all");
    }
}