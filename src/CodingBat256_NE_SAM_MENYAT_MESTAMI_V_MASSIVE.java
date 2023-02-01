import java.util.Arrays;

public class CodingBat256_NE_SAM_MENYAT_MESTAMI_V_MASSIVE {
    public static int[] fix34(int[] nums) {
        int afterThree;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 4 && nums[j] == 3) {
                    afterThree = nums[j + 1];
                    nums[j + 1] = nums[i];
                    nums[i] = afterThree;
                }
            }
        }
        return nums;
    }


    //my solution
    /*    int numsFour = 0;
        int afterThree;
        for (int i =0 ; i<nums.length;i++){
            if(nums[i]==3 ) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        numsFour = j;
                    }
                }
                afterThree = nums[i + 1];
                nums[i + 1] = nums[numsFour];
                nums[numsFour] = afterThree;
<<<<<<< HEAD

=======
>>>>>>> 5e378d3 (257)
            }
        }
        return nums;*/


    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]
                {1, 3, 1, 4, 4, 3, 1})));
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5e378d3 (257)
