import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*return an array that contains exactly the same numbers as the given array,
        but rearranged so that every 3 is immediately followed by a 4.
        Do not move the 3's, but every other number may move. The array
        contains the same number of 3's and 4's, every 3 has a number
        after it that is not a 3, and a 3 appears in the array before any 4.
        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]*/
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
            }
        }
        return nums;*/


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(fix34(new int[]
                {1, 3, 1, 4, 4, 3, 1})));
    }
}
