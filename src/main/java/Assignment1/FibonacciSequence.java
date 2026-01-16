package Assignment1;

public class FibonacciSequence {
    public static void main(String[] args){
        int n = 10;
        System.out.println("The " + n + "th number of the Fibonacci Sequence is: "+ fibonacci(n));
    }

    public static long fibonacci(int n){
        if(n <= 1 ){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
