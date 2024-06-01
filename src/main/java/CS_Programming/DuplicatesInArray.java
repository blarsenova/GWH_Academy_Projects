package CS_Programming;

public class DuplicatesInArray {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] numbers = {3, 5, 7, 2, 8, 3, 7, 4, 10, 12, 2, 4};

        // Remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();

        // Add elements to the HashSet (duplicates will be automatically handled)
        for (int num : array) {
            uniqueSet.add(num);
        }


    }

}
