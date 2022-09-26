
/*Given a string, return a version without the first 2 chars.
        Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"*/
public class CodingBat61 {
    public static String deFront(String str) {
        return str.charAt(0) == 'a' && str.charAt(1) == 'b' ? str :
                str.charAt(0) == 'a' ? str.charAt(0) + str.substring(2) :
                        str.charAt(1) == 'b' ? str.substring(1) :
                                str.substring(2);
    }

}
