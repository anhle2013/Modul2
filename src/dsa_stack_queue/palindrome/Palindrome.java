package dsa_stack_queue.palindrome;

import dsa_stack_queue.queue_array.MyQueue;
import dsa_stack_queue.stack_array.MyStack;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        boolean isPalindrome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check:");
        String string = scanner.nextLine();

        char[] characters = string.toCharArray();
        int size = characters.length;
        MyQueue<Character> myQueue = new MyQueue<>(size);
        MyStack<Character> myStack = new MyStack<>(size);

        for (char character: characters) {
            myQueue.enqueue(character);
            myStack.push(character);
        }

        for (int i = 0; i < size; i++) {
            if (myQueue.dequeue() != myStack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("This string is a Palindrome");
        else
            System.out.println("This string is NOT Palindrome");

    }
}
