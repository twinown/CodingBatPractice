
/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.
        twoTwo([4, 2, 2, 3]) → true
        twoTwo([2, 2, 4]) → true
        twoTwo([2, 2, 4, 2]) → false*/
public class CodingBat221_poisk_odin_par_ryadom {
    public static boolean twoTwo(int[] nums) {
        boolean b = true;
        int countTwos =0;
        int doing =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                countTwos++;
            }
            if (i!=nums.length-1&&nums[i]==2&&countTwos>doing){
                if (nums[i] != nums[i + 1]){
                    b = false;
                }
                doing++;
            }
            }
        return b;
        }



    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{2}));
    }
}
