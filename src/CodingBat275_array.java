/*Given an array of ints, compute recursively the number of times that
        the value 11 appears in the array. We'll use the convention
        of considering only the part of the array that begins at the
        given index. In this way, a recursive call can pass index+1
        to move down the array. The initial call will pass in index as 0.
        array11([1, 2, 11], 0) → 1
        array11([11, 11], 0) → 2
        array11([1, 2, 3, 4], 0) → 0*/
public class CodingBat275_array {
    public static int array11(int[] nums, int index) {
        int count = 0;
        if (nums.length!=0) {
            if (nums[index] == 11) {
                count++;
            }
            if (index + 1 < nums.length) {
                return count +array11(nums, index + 1);
            }
        }
        return count;
        }

    public static void main(String[] args) {
        System.out.println(array11(new int[]{1, 3, 11, 11}, 0));
    }
}
