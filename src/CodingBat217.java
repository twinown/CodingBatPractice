/*
Given an array of ints, return true if the array contains two 7's next to each other, or there
        are two 7's separated by one element, such as with {7, 1, 7}.
        has77([1, 7, 7]) → true
        has77([1, 7, 1, 7]) → true
        has77([1, 7, 1, 1, 7]) → false*/
public class CodingBat217 {
    public boolean has77(int[] nums) {
        boolean b = false;
        for (int i = 0;i<nums.length-2;i++){
            if ((nums[i] == nums[i + 1] && nums[i] == 7) ||
                    (nums[i] == nums[i + 2] && nums[i] == 7) ||
                    (nums[nums.length - 1] == nums[nums.length - 2]
                            && nums[nums.length - 2] == 7)) {
                b = true;
                break;
            }
        }
        return b;
    }
}
