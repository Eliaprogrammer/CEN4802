package com.example.assignment1;
/**
 * An application to calculate the <code>n</code> th number in the <code>Fibonacci Sequence</code>
 *
 * @author Owner Elia Schwartz
 */
public class FibonacciSequence {
    public static void main(String[] args){
        int n = 10;
        System.out.println("The " + n + "th number of the Fibonacci Sequence is: "+ fibonacci(n));
    }

    /**
     * Calculates the <code>n</code>th value at a <code>fibonacci</code> position with a recursive method
     *
     * @param n position or location of a number in the Fibonacci Sequence
     * @return long value in the position of the nth number or search value
     */
    public static long fibonacci(int n){
        if(n <= 1 ){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
