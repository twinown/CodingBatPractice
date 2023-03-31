import javax.management.MBeanRegistration;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
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
        int count = 0;
        List<Integer> stringsLength = new ArrayList<>();
        for (int i = 0; i <nums.length  ; i++) {
            for (int j = 1; j <nums.length ; j++) {
                if (nums[j]>nums[j-1]){
                    int temp  = nums[j-1];
                    nums[j-1]  =nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                stringsLength.add(nums[i]);

            }
        }
        /*String prevS = "";
        int max = 0;
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
       //     prevS = "";
            for (int j = length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    i++;
                    prevS+=nums[i];
                } else
            }

        }
        stringsLength.add(prevS.length());

        max = stringsLength.get(0);
        for (Integer i : stringsLength
        ) {
            if (i > max) {
                max = i;
            }
        }
        return max;*/
        return stringsLength.size();
    }







    /*   int length = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j>i; j--) {
                if (nums[i] == nums[j]){
                    if (Math.abs(nums[i]-nums[i+1])==Math.abs(nums[j]-nums[j-1])){
                   length++;
                    }
                }
            }
        }
        return length;*/
       /* List <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) == 1) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] == nums[i]) {
                        if ((Math.abs(nums[j] - nums[j - 1]) == 1)||Math.abs(nums[j] - nums[j + 1])==1) {
                            //if (!list.contains(nums[i])) {
                                list.add(nums[i]);
                          //  }
                            break;
                        }
                    }
                }
            }
        }
        return list;*/
    /*    List <Integer> list = new ArrayList<>();
        int inumb = 0;
        int fast = 0;
     //   int n = nums.length-1;
        for (int i = 0; i < nums.length ; i++) {
            fast = 0;
            inumb = i;
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] == nums[j]){
                    for (int k = j; k >i ; k--) {
                        if (nums[i]==nums[k]){
                            list.add(nums[i]);
                            fast++;
                            i++;
                        } else break;
                    }
                    if (fast<2){
                        i = inumb;
                        list.remove(i);

                    }
                }
            }

        }
        return list;*/
    // }

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}));       //3
        //     System.out.println(maxMirror(new int[]{1, 2, 1, 4}));                   //3
        //  System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));          //2
    }
}
