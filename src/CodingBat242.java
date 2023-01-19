import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingBat242 {
    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<strings.length; i++){
            if(!map.containsKey(strings[i].charAt(0)+"")){
                map.put(strings[i].charAt(0)+"", i);
            } else {
                String s =  strings[map.get(strings[i].charAt(0) + "")];
                strings[map.get(strings[i].charAt(0) + "")] = strings[i];
                strings[i] = s;
                map.remove(strings[i].charAt(0) + "");
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
    }
}
