/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true*/
public class CodingBat213 {
    public static boolean no14(int[] nums) {
        boolean gotOne = true;
        boolean gotFour = true;
        for (int i = 0; i<nums.length;i++){
            if(nums[i]==1) {
                gotOne = false;
            } else if (nums[i]==4){
                gotFour = false;
            }
        }
        return gotOne||gotFour;
    }

}
