/*
Given an array of ints, return true if every element is a 1 or a 4.
        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true*/
public class CodingBat211 {
    public boolean only14(int[] nums) {
            boolean b = true;
            for (int i  =0;i<nums.length;i++){
                if(nums[i]!=1&&nums[i]!=4){
                    b = false;
                    break;
                }
            }
            return b;
        }
}
