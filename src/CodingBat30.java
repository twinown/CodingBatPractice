/*Given a string, return a new string where the last 3 chars are now in upper case.
        If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"*/
public class CodingBat30 {
    public static String endUp(String str) {
        String substring = str.substring(str.length() - 3);
        return str.length()>3 ? str.replace(substring, substring.toUpperCase()) : str.toUpperCase();
    }
}
