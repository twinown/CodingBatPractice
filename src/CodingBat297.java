import java.util.List;

public class CodingBat297 {
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
    }

    public static void main(String[] args) {

        String s = "ant";
        String b = "ant";
        System.out.println(s.equals(b));
    }
}
