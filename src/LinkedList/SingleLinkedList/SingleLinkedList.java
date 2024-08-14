package LinkedList.SingleLinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert into a linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            // fixing the null pointer exception
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse a linked list
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    // Search for a node
    public boolean searchNode (int nodeValue){
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Deleting a node from a singly linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The list does not exist.");
            return;
        } else if (location == 0) { // Deleting at the beginning
            head = head.next;
            size--;
            if (size == 0) { // If the list is now empty, update tail
                tail = null;
            }
        } else if (location >= size) { // Deleting at the end
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // Only one node in the list
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // Deleting anywhere in the list
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}
