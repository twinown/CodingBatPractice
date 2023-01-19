/*
Return true if the group of N numbers at the start and end of the array are the same. For example,
        with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1
        and n=3. You may assume that n is in the range 0..nums.length inclusive.
        sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
        sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
        sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false*/
public class CodingBat222 {
    public static boolean sameEnds(int[] nums, int len) {
            boolean b = true;
            int [] begMass = new int [len];
            int [] endMass = new int [len];
            for (int i =0; i<=len-1;i++){
                begMass[i] = nums[i];
            }
            for (int i =0; i<=len-1;i++){
                endMass[i] = nums[nums.length-len+i];
            }
            for (int i =0; i<len;i++){
                if(begMass[i] != endMass[i]){
                    b = false;
                    break;
                }
            }
            return b;
        }


    public static void main(String[] args) {
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
    }
}
