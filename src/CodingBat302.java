import java.util.List;

public class CodingBat302 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n->n%10==9);
        return nums;
    }

}
