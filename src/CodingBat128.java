
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of strings, return a new List (e.g. an ArrayList) where all
        the strings of the given length are omitted. See wordsWithout()
        below which is more difficult because it uses arrays.


        wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]*/
public class CodingBat128 {
    public static List wordsWithoutList(String[] words, int len) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i<=words.length-1; i++){
            if(words[i].length()!=len){
                stringList.add(words[i]);
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
    }
}
