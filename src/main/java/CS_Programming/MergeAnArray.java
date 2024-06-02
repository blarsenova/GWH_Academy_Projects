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


}
