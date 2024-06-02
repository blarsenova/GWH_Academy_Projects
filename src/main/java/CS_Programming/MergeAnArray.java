package CS_Programming;

public class MergeAnArray {

    public static void main(String[] args) {
        // Example arrays to merge
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        // Call the mergeArrays method
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array with size equal to the sum of the sizes of the two arrays
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array into the merged array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from the second array into the merged array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Return the merged array
        return mergedArray;
    }

}
