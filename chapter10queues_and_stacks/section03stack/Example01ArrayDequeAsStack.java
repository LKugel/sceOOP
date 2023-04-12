package chapter10queues_and_stacks.section03stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example01ArrayDequeAsStack
{
    public static void main(String[] args)
    {
        // Create an empty stack using ArrayDeque
        Deque<String> stack = new ArrayDeque<>(); // Stack is empty

        // Push elements onto the stack
        stack.push("Java");
        // Stack: Java

        stack.push("is");
        // Stack: is
        //        Java

        stack.push("awesome");
        // Stack: awesome
        //        is
        //        Java

        // Print the top element of the stack without removing it
        System.out.println("Top element: " + stack.peek());  // Top element: awesome
        // Stack: awesome
        //        is
        //        Java

        // Remove and print the top element of the stack
        System.out.println("Top element: " + stack.pop());   // Top element: awesome
        // Stack: is
        //        Java

        // Remove and print the top element of the stack again
        System.out.println("Top element: " + stack.pop());   // Top element: is
        // Stack: Java
    }
}
