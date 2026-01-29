
package com.example.assignment2;
import com.example.assignment1.FibonacciSequence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        int n = 10;
        long output = FibonacciSequence.fibonacci(n);
        System.out.println("The " + n + "th number of the Fibonacci Sequence is: "+ output);
    }
}
