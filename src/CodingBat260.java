import java.util.Arrays;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,
        0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) → [0, 1, 2, 1]
        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]*/
public class CodingBat260 {
    public static int[] squareUp(int n) {
        int number;
        int countN = n;
        int [] nums  = new int [n*n];
        for (int i = nums.length-1;i>=0 ;i = i-n){
            number = i;
            for (int j = 1;j<=countN;j++){
                nums[i--] = j;
            }
            i = number;
            countN--;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(4)));
    }
}