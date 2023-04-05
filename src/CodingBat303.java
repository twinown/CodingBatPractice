import java.util.List;

public class CodingBat303 {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n->n<=19&&n>=13);
        return nums;
    }

}
