/*Given a string of any length, return a new
        string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"*/
public class CodingBat56 {
    public static String lastTwo(String str) {
        return  str.length()<=1 ? str:
                str.replace(str.substring(str.length()-2), str.substring(str.length()-1)+str.charAt(str.length()-2));
    }

}
