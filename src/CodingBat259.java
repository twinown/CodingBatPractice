
/*Given two arrays of ints sorted in increasing order, outer and inner, return true
        if all of the numbers in inner appear in outer. The best solution makes
        only a single "linear" pass of both arrays, taking advantage of the fact
        that both arrays are already in sorted order.
        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true*/
public class CodingBat259 {
    public  static  boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for (int i = 0 ;i<inner.length;i++){
            for (int j = 0 ;j<outer.length;j++){
                if (inner[i]==outer[j]){
                    count++;
                    break;
                }
            }
        }
        return count>=inner.length;
    }
//alternative solution
  /*  public boolean linearI(int[] outer, int[] inner) {
        int j=0;
        for(int i=0;i<outer.length&&j<inner.length;i++) {
            if (outer[i] == inner[j]) {
                j++;
            }
        }
        return j==inner.length;
    }*/
    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2,4}));
    }
}
