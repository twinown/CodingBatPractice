import java.util.Arrays;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,
        0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) → [0, 1, 2, 1]
        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]*/
public class CodingBat260 {
    public static int[] squareUp(int n) {
        int shag = n-1;
        int nnum;
        int [] nums  = new int [n*n];
        for (int i = 0;i<=nums.length-n;i=i+n){
            nnum = 1;
            for (int j = i;j<n;j++){
                nums[shag] = nnum;
               // if(shag<nums.length){
                    shag = (n-1)+n;
             //   }
                if(i!=n-1){
                    nums[j+1] = nnum+1;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
    }
}


   /* int shag = n-1;
    int nnum = 1;
    int [] nums  = new int [n*n];
        for (int i = nums.length-1;i>=0 ;i = i-n ){
                for (int j = 1;j<=n;j++){
                nums[i--] = j;
                }
                }
                return nums;*/