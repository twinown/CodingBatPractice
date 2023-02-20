/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
        countX("xxhixx") → 4
        countX("xhixhix") → 3
        countX("hi") → 0*/
public class CodingBat271_NE_SAM_PODSCHET_BUKV_plus_bubble_sort {
    public static int countX(String str) {
        int count = 0;
        if (count == str.length()) {
            return 0;
        } else if (str.charAt(count) == 'x') {
            count++;
        }
        //перебор по строке
        return count + countX(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        //System.out.println(Arrays.toString(bubbleSort(new int[]{5, 10, 15 ,7, 4 ,9 , 8, 6, 1})));
    }

    public static int [] bubbleSort(int[]nums){
        int nn;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]<nums[j]){
                    nn  = nums[i];
                    nums[i] = nums[j];
                    nums[j] = nn;
                }
            }

        }
        return nums;
    }

}
