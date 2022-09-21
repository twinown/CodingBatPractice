/*Given 2 strings, a and b, return a new string made of the first char of a
        and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"*/
public class CodingBat54 {
    public String lastChars(String a, String b) {
        return a.length()==0&&
                b.length()==0?"@@":a.length()==0?"@"+b.substring(b.length()-1):
                b.length()==0?a.charAt(0)+"@":
                        a.charAt(0)+b.substring(b.length()-1);
    }
}
