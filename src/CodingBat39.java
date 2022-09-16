/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"*/
public class CodingBat39 {
    public static String withoutEnd(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.deleteCharAt(0).deleteCharAt(stringBuilder.length()-1).toString();
    }


}
