import java.util.Arrays;

public class CodingBat231_NE_SAM_dvizhenie_chisel_po_massivu {
    public static int[] withoutTen(int[] nums) {
        int count = 0;
        int[] nnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
              nnums[count++] = nums[i];
            }
        }
        return nnums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 13, 10, 14, 10})));
    }
}
