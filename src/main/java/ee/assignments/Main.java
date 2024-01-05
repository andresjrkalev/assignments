package ee.assignments;

import ee.assignments.linkedlist.DoublyLinkedList;
import ee.assignments.mergesort.ArraySort;
import ee.assignments.observer.ConcreteObserver;
import ee.assignments.observer.Subject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        assignment1();
        System.out.println();
        assignment2();
        System.out.println();
        assignment3();
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

    private static void assignment3() {
        System.out.println("Assignment 3");
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteObserver concrete = new ConcreteObserver();
        Subject subject = new Subject();
        subject.add(concreteObserver);
        subject.add(observer);
        subject.add(concrete);
        subject.remove(observer);
        subject.notifyObservers("Hello world!");
    }
}
