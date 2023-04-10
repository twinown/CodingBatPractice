import java.util.List;

public class CodingBat306 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(n->n.length()==4||n.length()==3);
        return strings;
    }
}
