import java.util.List;

public class CodingBat297 {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
    }
}
