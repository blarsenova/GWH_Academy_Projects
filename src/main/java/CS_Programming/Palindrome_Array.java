package CS_Programming;


public class Palindrome_Array {

    // Method: Check if an array is a palindrome
    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Compare elements from both ends of the array
            if (array[left] != array[right]) {
                return false; // Array is not a palindrome
            }
            left++;
            right--;
        }
        return true; // Array is a palindrome
    }

    // Main method: Test array for palindrome
    public static void main(String[] args) {
        // Example array for demonstration
        int[] palindromeArray = {35, 8, 53, 7, 53, 8, 35};

        // Call the isPalindrome method
        boolean isPalindromic = isPalindrome(palindromeArray);

        // Print the result
        if (isPalindromic) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

}
