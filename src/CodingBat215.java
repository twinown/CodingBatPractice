/*
Given an array of ints, return true if the array contains a
        2 next to a 2 or a 4 next to a 4, but not both.
        either24([1, 2, 2]) → true
        either24([4, 4, 1]) → true
        either24([4, 4, 1, 2, 2]) → false*/
public class CodingBat215 {
    public static boolean either24(int[] nums) {
        boolean b = false;
        int counttwo = 0;
        int countfour = 0;
        for (int i = 0; i < nums.length;i++){
            if(nums[i]==2){
                counttwo++;
            } else if(nums[i]==4){
                countfour++;
            }
        }
        for (int i = 0; i < nums.length-1;i++){
            if ((nums[i] == 2 && nums[i + 1] == nums[i]) ||
                    (nums[i] == 4 && nums[i + 1] == nums[i])) {
                b = true;
                break;
            }
        }
        if(counttwo>=2&&countfour>=2){
            b = false;
        }
        return b;
    }



    public static void main(String[] args) {
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));
    }
}
