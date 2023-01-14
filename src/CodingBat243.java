import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingBat243 {

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].charAt(0) + "")) {
                map.put(strings[i].charAt(0) + "", i);
            } else if (!map2.containsKey(strings[i].charAt(0) + "")) {
                String s = strings[map.get(strings[i].charAt(0) + "")];
                strings[map.get(strings[i].charAt(0) + "")] = strings[i];
                strings[i] = s;
                map2.put(strings[i].charAt(0) + "", i);
                map.remove(strings[i].charAt(0) + "");
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
    }
}
