/*Given a string, return true if "bad" appears starting at index 0 or 1
        in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false*/
public class CodingBat51 {
    public boolean hasBad(String str) {
            return str.contains("bad")&&(str.charAt(0) == 'b' ||
                    str.charAt(1) == 'b');
    }



}
