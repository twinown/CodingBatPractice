import java.util.List;

public class CodingBat295 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->(n+1)*10);
        return nums;
    }
}
