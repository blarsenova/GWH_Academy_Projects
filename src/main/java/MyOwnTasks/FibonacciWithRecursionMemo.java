package MyOwnTasks;
import java.util.HashMap;
import java.util.Map;
public class FibonacciWithRecursionMemo {
    private Map<Integer, Integer> memo = new HashMap<>();

    // Method to calculate Fibonacci number using recursion with memoization
    public int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        if (n == 1) {
            return 0; // The first Fibonacci number is 0
        }
        if (n == 2) {
            return 1; // The second Fibonacci number is 1
        }
        if (memo.containsKey(n)) {
            return memo.get(n); // Return the cached value if it exists
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result); // Cache the computed result
        return result;
    }

}
