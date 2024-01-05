package ee.assignments.linkedlist;

/**
 * Reference: https://et.wikipedia.org/wiki/Ahelloend
 *
 * Custom integer linked list data structure
 */
public class DoublyLinkedList {

    /**
     * Head of the list
     */
    private Node head;

    /**
     * Adds new node to list
     *
     * @param data - represents node value as integer
     */
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node tailNode = findTailNode(head);
        Node nextNode = new Node(tailNode, data);
        tailNode.setNextNode(nextNode);
    }

    /**
     * Removes existing node from list
     *
     * @param data - represents node value what will be removed if exists
     */
    public void remove(int data) {
        removeNode(head, data);
    }

    /**
     * Prints list nodes with values to console
     */
    public void printList() {
        String result = printNode(head);
        System.out.println(result);
    }

    /**
     * Finds tail node starting from head recursively
     *
     * @param node - represents current node while finding
     * @return - returns tail node
     */
    private Node findTailNode(Node node) {
        Node nextNode = node.getNextNode();
        if (nextNode == null) return node;
        return findTailNode(nextNode);
    }

    /**
     * Removes node from list by value recursively
     *
     * @param node - represents current node while removing
     * @param value - represents node value what will be removed if exists
     */
    private void removeNode(Node node, int value) {
        if (node == null) return;
        Node nextNode = node.getNextNode();

        if (node.getValue() == value) {
            Node previousNode = node.getPreviousNode();
            previousNode.setNextNode(nextNode);
            return;
        }
        removeNode(nextNode, value);
    }

    /**
     * Prints list nodes with value and next node
     *
     * @param node - represents current node while printing
     * @return - returns list of nodes in text representation
     */
    private String printNode(Node node) {
        if (node == null) return null;
        String nextNode = printNode(node.getNextNode());
        return String.format("Node (%d, %s)", node.getValue(), nextNode);
    }
}
