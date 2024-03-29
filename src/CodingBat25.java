/*Given 2 int values, return whichever value is nearest to the value 10,
        or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0*/
public class CodingBat25 {
    public static int close10(int a, int b) {
        int one = 10-a;
        int two  = 10-b;
        if (Math.abs(one)==Math.abs(two)){
            return 0;
        }
        return Math.min(a, b);
    }
}
