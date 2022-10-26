<<<<<<< HEAD
/*Given an int array of any length, return a new array of its
        first 2 elements. If the array is smaller than length 2, use whatever elements are present.
=======
/*
Given an int array of any length, return
        a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
>>>>>>> 22eebd7a8fd872e2c27b44ec051530963a6ec2e9
        frontPiece([1, 2, 3]) → [1, 2]
        frontPiece([1, 2]) → [1, 2]
        frontPiece([1]) → [1]*/
public class CodingBat88 {
    public int[] frontPiece(int[] nums) {
        return nums.length<2?nums:new int []{nums[0],nums[1]};
    }

}
