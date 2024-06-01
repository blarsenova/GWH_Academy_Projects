package CS_Programming;

public class maxInArray {
    public static void main(String args[]) {

        int maxArray[] = {300, 6, 876};


        // Call the method to find the max value
        int maxValue = findMax(maxArray);

        // Print the max value
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static int findMax(int[] array) {
        // Check if the array is empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Initialize max with the first element of the array
        int max = array[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Update max if the current element is greater than max
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
