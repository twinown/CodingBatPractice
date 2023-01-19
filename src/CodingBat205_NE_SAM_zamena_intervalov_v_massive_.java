/*Return the sum of the numbers in the array, except ignore sections of numbers
        starting with a 6 and extending to the next 7 (every 6 will be
        followed by at least one 7). Return 0 for no numbers.
        sum67([1, 2, 2]) → 5
        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
        sum67([1, 1, 6, 7, 2]) → 4*/
public class CodingBat205_NE_SAM_zamena_intervalov_v_massive_ {
    public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 6){
                sum += nums[i];
            }
            else while(nums[i] != 7){
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
         System.out.println(sum67(new int[]{2, 7, 6, 2, 6, 7, 2, 7}));
    }
}
