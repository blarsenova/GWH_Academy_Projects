package CS_Programming;

public class SortedArray {

 public static boolean isSortedArray (int arr[]{

         int [] arraySorted = new int[] {4,6,1,14,55,97};


         //check below if array is sorted in ascending order
         for (int i=0; i<arraySorted.length-1; i++) {
            if (arraySorted[i] > arraySorted[i + 1]) {
                return false;

            } else {
                return true;
            }
        }
        public static void main (String args []){


        }

    }
}
