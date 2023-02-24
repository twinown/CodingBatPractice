
/*Given an array of ints, compute recursively if the array contains a 6.
        We'll use the convention of considering only the part of the
        array that begins at the given index. In this way, a recursive
        call can pass index+1 to move down the array. The initial call
        will pass in index as 0.
        array6([1, 6, 4], 0) → true
        array6([1, 4], 0) → false
        array6([6], 0) → true*/
public class CodingBat274 {
    public static boolean array6(int[] nums, int index) {
        boolean b = false;
        if (nums.length!=0) {
            if (nums[index] == 6) {
                return true;
            } else if (index + 1 < nums.length) {
                return array6(nums, index + 1);
            }
        }
            return b;
    }

    public static void main(String[] args) {
        System.out.println(array6(new int[]{}, 0));
    }
}
