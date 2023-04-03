import java.util.List;

public class CodingBat301 {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n->n<0);
        return nums;
    }
}
