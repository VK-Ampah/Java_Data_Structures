package ToDoList;


public class TaskList {

    // create a private inner class Node to represent a node in the linked list
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // constructor with head set to null
    public TaskList() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // mark a task as completed by setting isCompleted to true
    public void markTaskAsCompleted(String description) {
        // start from the head
        Node temp = head;
        while (temp != null) {
            if (temp.task.getDescription().equals(description)) {
                temp.task.markAsCompleted();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found: " + description);
    }

    // print all tasks in the list
    public void printAllTasks() {
        //start from the head
        Node temp = head;
        if (temp == null) {
            System.out.println("No tasks in the list.");
        } else {
            while (temp != null) {
                System.out.println(temp.task);

                // move to the next node until temp is null (end of the list)
                temp = temp.next;
            }
        }
    }
}
