public class CodingBat276 {
    public static  boolean array220(int[] nums, int index) {
        boolean b = false;
        if (nums.length!=0&&index!=0) {
            if (nums[index] == nums[index-1]*10) {
                return true;
            } else if (index + 1 < nums.length) {
                return array220(nums, index + 1);
            }
        } else if (nums.length!=1&&nums.length!=0) {
            return array220(nums, index + 1);
        } else return false;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(array220(new int[]{},0));
    }
}
