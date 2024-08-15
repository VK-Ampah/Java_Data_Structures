package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArray = new StackArrays(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.isEmpty();
        stackArray.isFull();
        stackArray.peek();
        stackArray.pop();
        stackArray.isPalindrome("racecar");


    }
}
