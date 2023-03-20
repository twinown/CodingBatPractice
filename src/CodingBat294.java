import java.util.List;

public class CodingBat294 {
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n->"y"+n+"y");
        return strings;
    }

}
