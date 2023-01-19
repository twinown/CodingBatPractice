/*
Given an array of ints, return true if one of the first 4 elements in the array is a
        9. The array length may be less than 4.
        arrayFront9([1, 2, 9, 3, 4]) → true
        arrayFront9([1, 2, 3, 4, 9]) → false
        arrayFront9([1, 2, 3, 4, 5]) → false*/
public class CodingBat162 {
    public boolean arrayFront9(int[] nums) {
        boolean bb = false;
        for (int i = 0; i<=nums.length-1;i++){
            if (nums[i]==9&&i!=4){
                bb = true;
                break;
            }
        }
        return bb;
    }
}
