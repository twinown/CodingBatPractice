import java.util.HashMap;
import java.util.Map;

/*Given an array of non-empty strings, return a Map<String, String> with a key for every different
        first character seen, with the value of all the strings starting with that character
        appended together in the order they appear in the array.
        firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        firstChar([]) → {}*/
public class CodingBat239 {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> mapss = new HashMap<>();
        for (int i = 0; i<strings.length; i++){
            String  s = "";
            char ch = strings[i].charAt(0);
            for (int j = 0; j<strings.length; j++){
                if (ch == strings[j].charAt(0)){
                    s = s + strings[j];
                }
                mapss.put(ch+"",s);
            }
        }
        return mapss;
    }

    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
    }
}
