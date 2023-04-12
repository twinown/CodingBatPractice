import java.util.List;

public class CodingBat308 {
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n->n*2);
        nums.removeIf(n->n%10==2);
        return nums;
    }
}
