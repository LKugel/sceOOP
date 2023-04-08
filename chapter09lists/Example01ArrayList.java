package chapter09lists;

import java.util.ArrayList;

public class Example01ArrayList {
    public static void main(String[] args)
    {

        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<String>();

        // Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("orange");
        fruits.add("fig");

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Access elements of the ArrayList
        String firstElement = fruits.get(0);
        String secondElement = fruits.get(1);
        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);
    }
}
