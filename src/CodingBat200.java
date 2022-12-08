import java.util.Scanner;
import java.util.regex.Pattern;

/*Given a string and a non-empty word string, return a string made of each char just before and
        just after every appearance of the word in the string. Ignore cases where there is
        no char before or after the word, and a char may be included twice if it is between two words.
        wordEnds("abcXY123XYijk", "XY") → "c13i"
        wordEnds("XY123XY", "XY") → "13"
        wordEnds("XY1XY", "XY") → "11"*/
public class CodingBat200 {
    public static String wordEnds(String str, String word) {
        str = str.replace(word, "*");
        System.out.println(str);
        Pattern pattern = Pattern.compile(".?\\*.?");
        String s = Pattern.quote(str);


        return  s;

    }

    public static void main(String[] args) {
     System.out.println(wordEnds("abcXY123XYijk", "XY"));
    }
}
