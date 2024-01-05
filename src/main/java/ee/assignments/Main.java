package ee.assignments;

import ee.assignments.linkedlist.DoublyLinkedList;
import ee.assignments.mergesort.ArraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        assignment1();
        System.out.println();
        assignment2();
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

    private static void assignment2() {
        System.out.println("Assignment 2");
        ArraySort arraySort = new ArraySort();
        int[] array = {6, 5, 3, 1, 8 , 7, 2, 4};
        int[] sortedArray = arraySort.mergeSort(array);
        String result = Arrays.toString(sortedArray);
        System.out.println(result);
    }
}
