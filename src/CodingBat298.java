import java.util.List;

public class CodingBat298 {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n->n.replace("x",""));
        return strings;
    }

}
