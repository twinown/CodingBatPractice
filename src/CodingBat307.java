import java.util.List;

public class CodingBat307 {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n->n+"y");
        strings.removeIf(n->n.contains("yy"));
        return strings;
    }
}
