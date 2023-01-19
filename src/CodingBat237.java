import java.util.HashMap;
import java.util.Map;

/*Given an array of non-empty strings, create and return a Map<String, String>
as follows: for each string add its first character as a key with its last
        character as the value.
        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        pairs(["man", "moon", "main"]) → {"m": "n"}
        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}*/
public class CodingBat237 {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> mapss = new HashMap<>();
        for (int i = 0;i<strings.length; i++){
            mapss.put(strings[i].substring(0,1),
                    strings[i].substring(strings[i].length()-1));
        }
        return mapss;
    }
}
