/*
Given an array of ints, return true if the array contains a
        2 next to a 2 or a 4 next to a 4, but not both.
        either24([1, 2, 2]) → true
        either24([4, 4, 1]) → true
        either24([4, 4, 1, 2, 2]) → false*/
public class CodingBat215 {
    public static boolean either24(int[] nums) {
        int counta = 0;
        int countb = 0;
        boolean b = false;
        for (int i = 1; i < nums.length;i++){
            if(nums[i]==2){
                counta++;
            } else if (nums[i]==4)
               {
                   countb++;
               }
                if(nums[i]==nums[i-1]){
                    b = true;
                }
            }

        if(counta==2&&countb==2){
            b = false;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));
    }
}
