package MyOwnTasks;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

    int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
        if (nums[readPointer] != val) {
            nums[writePointer] = nums[readPointer];
            writePointer++;
        }
    }

        return writePointer;
}

public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = remove.removeElement(nums, val);
        System.out.println("Array after removal: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(nums, 0, k)));
        System.out.println("Number of elements not equal to val: " + k);


    }
}
