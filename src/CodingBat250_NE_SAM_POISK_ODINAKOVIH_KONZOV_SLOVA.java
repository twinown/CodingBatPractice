
/*Given a string, return the longest substring that appears at both
        the beginning and end of the string without overlapping.
        For example, sameEnds("abXab") is "ab".
        sameEnds("abXYab") → "ab"
        sameEnds("xx") → "x"
        sameEnds("xxx") → "x"*/
public class CodingBat250_NE_SAM_POISK_ODINAKOVIH_KONZOV_SLOVA {
    public static String sameEnds(String string) {
        String str = "";
        for (int i = 0; i<string.length()/2+1; i++){
            if(string.substring(0,i).equals(string.substring(string.length()-i)))
                str=string.substring(0,i);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds("xxodcj"));
    }
}
