/*
Given a string and a non-empty word string, return a version of the original String where all
        chars have been replaced by pluses ("+"), except for appearances of the word
        string which are preserved unchanged.
        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/
public class CodingBat199_NE_SAM_replace_all_NAOBOROT__KRUTO_ {
    public static String plusOut(String str, String word) {
        str = str.replace(word, "*");
        str = str.replaceAll("[^\\*]", "+");
        return  str.replace("*", word);
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }
}

