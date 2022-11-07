import java.util.Arrays;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"*/
public class CodingBat154 {
    public static String stringTimes(String str, int n) {
        String[] arrstr = new String[n];
        for (int i = 0; i < n; i++) {
            arrstr[i] = str;
        }
        return String.join("", arrstr);
    }

    //alternative
   /* public String stringTimes(String str, int n) {
        String res ="";
        for (int i = 0; i < n; i++) {
            res += str;
        }
        return res;
    }*/


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
    }
}
