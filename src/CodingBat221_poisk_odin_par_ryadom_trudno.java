
/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.
        twoTwo([4, 2, 2, 3]) → true
        twoTwo([2, 2, 4]) → true
        twoTwo([2, 2, 4, 2]) → false*/
public class CodingBat221_poisk_odin_par_ryadom_trudno {
    public boolean twoTwo(int[] nums) {
        boolean b = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] != 2) {
                    b = false;
                } else i++;
            } else if (nums[i + 1] == 2 && i == nums.length - 2) {
                b = false;
            }
        }
        if (nums.length == 1 && nums[0] == 2) {
            b = false;
        }
        return b;
    }
}

