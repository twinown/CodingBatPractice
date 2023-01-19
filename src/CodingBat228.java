import java.util.Arrays;

/*
Given a non-empty array of ints, return a new array containing the elements
        from the original array that come after the last 4 in the original array.
        The original array will contain at least one 4. Note that it is valid in java
        to create an array of length 0.
        post4([2, 4, 1, 2]) → [1, 2]
        post4([4, 1, 4, 2]) → [2]
        post4([4, 4, 1, 2, 3]) → [1, 2, 3]*/
public class CodingBat228 {
    public static int[] post4(int[] nums) {
        int [] nenums;
        int four = 0;
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==4){
                four  = i;
            }
        }
        nenums = new int[nums.length-1-four];
        for (int j = 0; j < nums.length-1-four; j++) {
            nenums[j] = nums[four+j+1];
        }
        return nenums;
    }

}
