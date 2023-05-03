/*
We'll say that a value is "everywhere" in an array if for every
        pair of adjacent elements in the array, at least one of the
        pair is that value. Return true if the given value is everywhere
        in the array.
        isEverywhere([1, 2, 1, 3], 1) → true
        isEverywhere([1, 2, 1, 3], 2) → false
        isEverywhere([1, 2, 1, 3, 4], 1) → false*/
public class CodingBat214_poisk_odinak_par_cherez_odin {
/*    public static boolean isEverywhere(int[] nums, int val) {

        boolean b = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == val) {
                if (nums[i] != nums[i + 2])
                    b = false;
            }
        }
        return b;
    }*/
public static boolean isEverywhere(int[] nums, int val) {
    boolean b = false;
    if(nums.length>1){
        for (int i =0 ;i<nums.length;i++){
            if (i!= nums.length-1){
                if(nums[i]==val||nums[i+1]==val){
                    b = true;
                } else {
                    b = false;
                    break;
                }
            } else  if(nums[i]==val||nums[i-1]==val){
                b = true;
            } else {
                b = false;
                break;
            }
        }
    }
    return nums.length <= 1 || b;
}

    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2));
    }
}

