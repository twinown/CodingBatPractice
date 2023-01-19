public class CodingBat218 {
    public boolean has12(int[] nums) {
        boolean existOne = false;
        int numOne = 0;
        int numTwo = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i]==1){
                numOne = i;
                existOne = true;
            } else if (nums[i]==2){
                numTwo = i;
            }
        }
        return numTwo > numOne && existOne;
    }
}
