import java.util.HashMap;
import java.util.Map;

/*
Loop over the given array of strings to build a result string like this: when
        a string appears the 2nd, 4th, 6th, etc. time in the array, append
        the string to the result. Return the empty string if no string appears a 2nd time.
        wordAppend(["a", "b", "a"]) → "a"
        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
        wordAppend(["a", "", "a"]) → "a"*/
public class CodingBat240 {
    public static Map<String, Integer> wordAppend(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        String str = "";
            for (int i = 0;i<strings.length;i++) {
              map.put(strings[i],i);
            }
        return map;
    }


    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}));
    }
}
