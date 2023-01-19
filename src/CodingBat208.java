/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        sum28([2, 3, 2, 2, 4, 2]) → true
        sum28([2, 3, 2, 2, 4, 2, 2]) → false
        sum28([1, 2, 3, 4]) → false*/
public class CodingBat208 {
    public boolean sum28(int[] nums) {
        int count =0;
        for (int i = 0; i<nums.length;i++){
            if (nums[i]==2){
                count = count + 2;
            }
        }
        return count==8;
    }
}
