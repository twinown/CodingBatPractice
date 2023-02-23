
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
        // TODO: 23.02.2023 думай
        boolean b;
        if (nums[index] == 6) {
            b = true;
        } else b = false;
        return array6(nums, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(array6(new int[]{1, 6, 4}, 0));
    }
}
