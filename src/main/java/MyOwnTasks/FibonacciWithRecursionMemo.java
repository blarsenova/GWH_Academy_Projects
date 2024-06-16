package MyOwnTasks;
public class FibonacciWithRecursionMemo {
    private static long[] fibonacciCache;
    // Method to calculate Fibonacci number using recursion with memoization
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        long nthFibNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibNumber;
        return nthFibNumber;
    }
    public static void main(String[] args){
            int n = 7;
            fibonacciCache = new long[n + 1];

            for (int i=0; i<=n; i++){
                System.out.print(fibonacci(i) +" ");
            }

    }
}

