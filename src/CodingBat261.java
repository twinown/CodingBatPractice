import java.util.Arrays;

/*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
        (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
        which is known to sum to exactly n*(n + 1)/2.
        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]*/
public class CodingBat261 {
    public static int[] seriesUp(int n) {
        int number;
        int countN = n;
        int round = 0;
        int [] nums  = new int [n*(n + 1)/2];
        for (int i = nums.length-1;i>=0 ;i-=countN){
            number = i;
            for (int j = n;j>=1;j--){
                nums[i--] = j;
            }
            i = number;
            n--;
            round++;
            if (round>1) {
                countN--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(2)));
    }
}
