package CS_Programming;

public class SortedArray {

    public static boolean isSortedArray(int arraySorted[]) {

        //check below if array is sorted in ascending order
        for (int i = 0; i < arraySorted.length - 1; i++) {
            if (arraySorted[i] > arraySorted[i + 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] arraySorted = {4, 6, 10, 14, 55, 97};
        boolean isSorted = isSortedArray(arraySorted);

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order");

        }
    }
}






