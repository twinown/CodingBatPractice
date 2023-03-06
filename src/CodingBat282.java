
/*Given a string, compute recursively (no loops) the number of "11" substrings in
        the string. The "11" substrings should not overlap.
        count11("11abc11") → 2
        count11("abc11x11x11") → 3
        count11("111") → 1*/
public class CodingBat282 {
    public static int count11(String str) {
        if (str.length()>=2) {
            if (str.startsWith("11")) {
                return count11(str.substring(2)) + 1;
            } else return count11(str.substring(1));
        } else return 0;
    }

    public static void main(String[] args) {
        System.out.println(count11("11x111x1111"));
    }
}
