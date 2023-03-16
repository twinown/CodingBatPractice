import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingBat290_lambdas_in_list {
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n->n*2).collect(Collectors.toList());
        //or
       /* nums.replaceAll(n->n*2);
        return nums;*/
    }

    public static void main(String[] args) {
        System.out.println(doubling(Arrays.asList(1,2,3)));
    }
}
