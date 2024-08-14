package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("Inserting at the start");
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        doublyLinkedList.traverseDLL();
        doublyLinkedList.reverseTraverseDLL();
        doublyLinkedList.searchDLL(2);
        doublyLinkedList.deleteNodeDLL(0);
        doublyLinkedList.traverseDLL();
        doublyLinkedList.deleteDLL();
        doublyLinkedList.traverseDLL();

    }
}
