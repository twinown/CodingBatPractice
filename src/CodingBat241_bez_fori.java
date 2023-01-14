import java.util.HashMap;
import java.util.Map;

public class CodingBat241_bez_fori {
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

    //более элегантное решение
  /*  public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (String s:strings) {
            // plan for stored boolean:
            //   false = seen it once
            //   true = seen it twice or more
            if (!map.containsKey(s)) {
                map.put(s, false);
            }
            else if (map.get(s) == false) {  // works without this test
                map.put(s, true);
            }
        }
        return map;
    }*/

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
