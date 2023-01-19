
/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        has22([1, 2, 2]) → true
        has22([1, 2, 1, 2]) → false
        has22([2, 1, 2]) → false*/
public class CodingBat206 {
    public boolean has22(int[] nums) {
        boolean b = false;
        for (int i =0; i<nums.length-1;i++){
            if (nums[i] == 2 && nums[i + 1] == 2) {
                b = true;
                break;
            }
        }
        return b;
    }
}
