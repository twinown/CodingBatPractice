import java.util.Arrays;

/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the
        values, except ignoring the largest and smallest values in the array. If there are
        multiple copies of the smallest value, ignore just one copy, and likewise for the
        largest value. Use int division to produce the final average. You may assume that
        the array is length 3 or more.
        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3*/
public class CodingBat203 {

    public static void centeredAverage(int[] nums) {
        int [] nm = new int[nums.length-2];
        int sum = 0;
        int maxn = 0;
        int minn = 0;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxn = i;
            } else if (nums[i] < min) {
                min = nums[i];
                minn = i;
            }
            if (){
                nm[i] = nums[i];
            }

        }
        nums[maxn] = 0;
        nums[minn] = 0;
   //     sum = sum - nums

     System.out.println(sum);

      /*  if(nums.length%2!=0){
            res = nums[nums.length/2];
        } else res = (nums[nums.length/2] + nums[(nums.length/2)-1])/2;
        return res;*/
    }


    public static void main(String[] args) {
       centeredAverage(new int[]{1, 2, 3, 4, 100});
         //   System.out.println(centeredAverage(new int[]{1000, 0, 1, 99}));
    }
}
