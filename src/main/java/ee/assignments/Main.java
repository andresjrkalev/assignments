package ee.assignments;

import ee.assignments.linkedlist.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        assignment1();
    }

    private static void assignment1() {
        System.out.println("Assignment 1");
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        list.remove(4);
        list.printList();
    }
}
