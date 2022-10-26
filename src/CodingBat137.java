import java.util.Arrays;

/*
We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array,
        return the sum of the changes for a walk beginning at the start index and ending at the end index. For example,
        with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both
        be valid indexes into the array with start <= end.
        sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
        sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
        sumHeights([5, 3, 6, 7, 2], 0, 4) → 11*/
public class CodingBat137 {
    public static int sumHeights(int[] heights, int start, int end) {
        int [] cc = heHe(heights,start,end);
        //6 7 2
        int m = 0;
        for (int i = 0; i <= cc.length-2; i++) {
            m = m + Math.abs(cc[i] - cc[i+1]);
        }
       return m;
    }

    public static int[] heHe (int[] heights, int start, int end){
        int [] mm  = new int[end-start+1];
        for (int i = start;i<=end;i++ ){
            for (int j = 0; j <= mm.length-1;j++) {
                if (heights[j]!=-1){
                    mm[j] = heights[i];
                    heights[j] = -1;
                    break;
                }
            }
        }
        return mm;
    }
    public static void main(String[] args) {
        System.out.println(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}
