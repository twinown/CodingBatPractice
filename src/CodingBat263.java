import java.util.Arrays;

public class CodingBat263 {
    public static int countClumps(int[] nums) {
        int n;
        int count = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            n = 1;
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    n++;
                    last = j;
                } else if (nums[i] != nums[j]) {
                    break;
                }
            }
            if (n >= 2) {
                count++;
                i = last;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
    }
}


