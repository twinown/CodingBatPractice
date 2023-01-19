
/*Given an array of ints of odd length, return a new array
        length 3 containing the elements from the middle of the array. The array length will be at least 3.
=======

/*Given an array of ints of odd length,
return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
>>>>>>> 22eebd7a8fd872e2c27b44ec051530963a6ec2e9
        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree([1, 2, 3]) → [1, 2, 3]*/
public class CodingBat86 {
    public int[] midThree(int[] nums) {
        return new int []{nums[nums.length/2-1], nums[nums.length/2],
                nums[nums.length/2+1]};
    }
}
