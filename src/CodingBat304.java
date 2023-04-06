import java.util.List;

public class CodingBat304 {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n->n.contains("z"));
        return strings;
    }
}
