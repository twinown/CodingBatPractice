import java.util.HashMap;
import java.util.Map;

public class CodingBat241 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        int count = 0;
        for (String string : strings) {
            count = 0;
            for (String s : strings) {
                if (string.equals(s)) {
                    count++;
                    if (count >= 2) {
                        map.put(string, true);
                    } else map.put(string, false);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
