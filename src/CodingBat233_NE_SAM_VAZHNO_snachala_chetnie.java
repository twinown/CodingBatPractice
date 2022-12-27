import java.util.Arrays;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that
        all the even numbers come before all the odd numbers. Other than that, the numbers
        can be in any order. You may modify and return the given array, or make a new array.
        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) → [2, 3, 3]
        evenOdd([2, 2, 2]) → [2, 2, 2]*/
public class CodingBat233_NE_SAM_VAZHNO_snachala_chetnie {
    public static int[] evenOdd(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                int nn = nums[i];
                nums[i] = nums[count];
                nums[count] = nn;
                count++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOdd(new int[]{2,3,4,3,5,6})));
    }
}
