import java.util.List;

public class CodingBat292 {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n->n+"*");
        return strings;
    }

}
