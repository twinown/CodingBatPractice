import java.util.HashMap;

/*
Loop over the given array of strings to build a result string like this: when
        a string appears the 2nd, 4th, 6th, etc. time in the array, append
        the string to the result. Return the empty string if no string appears a 2nd time.
        wordAppend(["a", "b", "a"]) → "a"
        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
        wordAppend(["a", "", "a"]) → "a"*/
public class CodingBat240_NE_SAM {
    public static String wordAppend(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : strings)
            if (!map.containsKey(s))
                map.put(s, 1);
            else {
                map.put(s, map.get(s) + 1);
                if (map.get(s) % 2 == 0)
                    result.append(s);
            }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}));
    }
}
