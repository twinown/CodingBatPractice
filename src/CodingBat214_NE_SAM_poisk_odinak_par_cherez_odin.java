/*
We'll say that a value is "everywhere" in an array if for every
        pair of adjacent elements in the array, at least one of the
        pair is that value. Return true if the given value is everywhere
        in the array.
        isEverywhere([1, 2, 1, 3], 1) → true
        isEverywhere([1, 2, 1, 3], 2) → false
        isEverywhere([1, 2, 1, 3, 4], 1) → false*/
public class CodingBat214_NE_SAM_poisk_odinak_par_cherez_odin {
    public static boolean isEverywhere(int[] nums, int val) {
        boolean b = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == val) {
                if (nums[i] != nums[i + 2])
                    b = false;
            }
        }
        return b;

    }
}
