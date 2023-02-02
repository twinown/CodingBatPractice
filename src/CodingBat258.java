public class CodingBat258 {
    public static boolean canBalance(int[] nums) {
        int firstSum = 0;
        int secondSum = 0;
        boolean b = false;
        for (int i = 0;i<nums.length;i++){
            firstSum += nums[i];
            for (int j = i+1;j<nums.length;j++){
                secondSum+=nums[j];
            }
            if (firstSum==secondSum){
                b = true;
            } else secondSum  = 0;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{10,10}));
    }
}
