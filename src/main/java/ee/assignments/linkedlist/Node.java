package ee.assignments.linkedlist;

/**
 * Custom element for DoublyLinkedList
 */
public class Node {
    private Node previousNode;
    private final int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
    }

    public Node(Node previousNode, int value) {
        this.previousNode = previousNode;
        this.value = value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
