/*Consider the leftmost and righmost appearances of some value in an array.
        We'll say that the "span" is the number of elements between the
        two inclusive. A single value has a span of 1. Returns the largest
        span found in the given array. (Efficiency is not a priority.)
        maxSpan([1, 2, 1, 1, 3]) → 4
        maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
        maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6*/
public class CodingBat255 {
    public static int maxSpan(int[] nums) {
        int max = 0;
        int count = 1;
        int firstMax = 0;
        for (int i = 0;i<nums.length; i++){
            count = 0;
            for(int j = i;j<nums.length; j++){
                count++;
                if (nums[i]==nums[j]){
                    firstMax = count;
                }
            }
            if(firstMax>max){
                max = firstMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}
