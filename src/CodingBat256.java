import java.util.Arrays;

public class CodingBat256 {
    public static int[] fix34(int[] nums) {
        int numsFour = 0;
        int numsThree = 0;
        int afterThree = 0;
        for (int i =0 ; i<nums.length;i++){
            if(nums[i]==3&&numsThree!=i){
                numsThree = i;
                for (int j = 0 ; j<nums.length;j++){
                    if (nums[j]==4&&numsFour!=j){
                        numsFour = j;
                    }
                    afterThree =  nums[i+1];
                    nums[i+1] = nums[numsFour];
                    nums[numsFour] = afterThree;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));
    }
}
