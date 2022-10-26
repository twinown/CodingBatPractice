import java.util.Arrays;

/*
Given an array of positive ints, return a new array of length "count"
containing the first even numbers from the original array.
The original array will contain at least "count" even numbers.
        copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
        copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
        copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]*/
public class CodingBat131 {
    public static int[] copyEvens(int[] nums, int count) {
        int[] arrs = new int[count];
        for (int i = 0; i <= count - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[j] % 2 == 0&&nums[j]!=0) {
                    arrs[i] = nums[j];
                      nums[j]=0;
                    break;
                }
            }
        }
            return arrs;
        }


        public static void main (String[]args){
            System.out.println(Arrays.toString(copyEvens(new int[]{3, 1, 5, 4, 8}, 2)));
        }

    }

