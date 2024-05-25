package CS_Programming;

public class Palindrome_Array {

public static void (String args[]){

    bool isPalindrome(int array[], int size) {
        int start = 0;
        int end = size - 1;
        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    }
}
