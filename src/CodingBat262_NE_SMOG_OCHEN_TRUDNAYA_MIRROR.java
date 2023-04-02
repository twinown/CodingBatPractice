import javax.management.MBeanRegistration;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that
        somewhere in the array, the same group appears in reverse order. For example,
        the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
        Return the size of the largest mirror section found in the given array.
        maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
        maxMirror([1, 2, 1, 4]) → 3
        maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2*/
public class CodingBat262_NE_SMOG_OCHEN_TRUDNAYA_MIRROR {
    public static int maxMirror(int[] nums) {
List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length ; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                list.add(nums[i]);
                list.add(nums[i+1]);
                i++;
            }
        }
        System.out.println(list);
        for (int i = 0; i <list.size()-2; i=i+2) {
            if (list.get(i)==list.get(i+2)){
                list.remove(i);
            }
        }
        System.out.println(list);
        return list.size();
    }



    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}));       //3
      //2
    }
}
