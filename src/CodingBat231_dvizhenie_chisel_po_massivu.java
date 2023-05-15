/*
Return a version of the given array where all the 10's have been removed. The remaining
        elements should shift left towards the start of the array as needed, and the
        empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields
        {1, 2, 0, 0}. You may modify and return the given array or make a new array.
        withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
        withoutTen([10, 2, 10]) → [2, 0, 0]
        withoutTen([1, 99, 10]) → [1, 99, 0]*/
public class CodingBat231_dvizhenie_chisel_po_massivu {

    public static int[] withoutTen(int[] nums) {
        int count = 0;
        int[] nnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
              nnums[count++] = nums[i];
            }
        }
        return nnums;
    }
    public static void main(String[] args) {
        //   System.out.println(Arrays.toString(withoutTen(new int[]{10, 13, 10, 14, 10})));
    }
}
