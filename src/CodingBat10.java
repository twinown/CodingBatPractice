import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodingBat10 {

 /*   Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"*/

    public static String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();

    }


}
