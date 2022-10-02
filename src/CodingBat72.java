/*
Given an array of ints length 3, figure out which
        is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]*/
public class CodingBat72 {
    public int[] maxEnd3(int[] nums) {
        return nums[0]>nums[2]?
                new int[]{nums[0], nums[0],nums[0]}:
                new int[]{nums[2], nums[2],nums[2]};
    }


}
