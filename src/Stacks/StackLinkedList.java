package Stacks;

public class StackLinkedList<T> {
    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node top;
    private int size;

    public StackLinkedList() {
        this.top = null;
        this.size = 0;
        System.out.println("The stack is created.");
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push method to add a value to the stack
    public void push(T value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        System.out.println("The value " + value + " is successfully inserted");
    }

    // Pop method to remove and return the top value from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return null; // Indicating the stack is empty
        } else {
            T poppedValue = top.value;
            top = top.next;
            size--;
            System.out.println("Popped value: " + poppedValue);
            return poppedValue;
        }
    }

    // Peek method to return the top value without removing it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
            return null; // Indicating the stack is empty
        } else {
            System.out.println("Top of Stack: " + top.value);
            return top.value;
        }
    }

    // Delete the stack by resetting the top node and size
    public void deleteStack() {
        top = null;
        size = 0;
        System.out.println("Stack is successfully deleted");
    }

    // palindrome
    public boolean isPalindrome(String word) {
        StackLinkedList<Character> stack = new StackLinkedList<>();

        // Push all characters of the word onto the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop all characters from the stack and build the reversed word
        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop());
        }

        // Compare the original word with the reversed word
        if (word.equals(reversedWord.toString())) {
            System.out.println(word + " is a palindrome.");
            return true;
        } else {
            System.out.println(word + " is not a palindrome.");
            return false;
        }
    }

    //  test the stack
    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.peek();
        stack.deleteStack();

        // test if "racecar" is a palindrome
        StackLinkedList<String> stackPalindromeChecker = new StackLinkedList<>();
        stackPalindromeChecker.isPalindrome("racecar");

        // Check for edge cases : "hello" is a palindrome
        stackPalindromeChecker.isPalindrome("hello");
    }
}
