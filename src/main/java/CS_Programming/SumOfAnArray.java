package CS_Programming;

public class SumOfAnArray {

    public static void main (String args []){

       int [] array1 = new int[]{2,5,2,40,200};
       int sum =0;
       int i;

       for (i=0; i<array1.length;i++) {
           sum += array1[i];
       }
           System.out.println("Sum of an array is: " + sum);

    }
}
