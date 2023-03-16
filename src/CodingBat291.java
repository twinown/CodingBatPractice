import java.util.List;

public class CodingBat291 {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }
}
