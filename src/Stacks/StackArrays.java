package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    // Check if stack is Full
    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    // Implement push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        } else {
            int poppedValue = arr[topOfStack];
            topOfStack--;
            System.out.println("Popped value: " + poppedValue);
            return poppedValue;
        }
    }

    // Implement peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
            return -1;
        } else {
            System.out.println("Top of Stack: " + arr[topOfStack]);
            return arr[topOfStack];
        }
    }

    // Implement delete stack
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("Stack is successfully deleted");
    }

    // Use stack to check if a word is a palindrome
    public boolean isPalindrome(String word) {
        StackArrays stack = new StackArrays(word.length());

        // Push all characters of the word onto the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop all characters from the stack and build the reversed word
        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append((char) stack.pop());
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


}
