
/*Given a string, if one or both of the first 2 chars is 'x',
        return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"*/
public class CodingBat64 {
    public String withoutX2(String str) {
        return str.length()<1?"":
                (str.startsWith("xx"))?str.replace("x", ""):
                        str.charAt(0)=='x'? str.substring(1):
                                str.charAt(1)=='x' ? str.substring(0, 1)+
                                        str.charAt(str.length()-1):str;
    }
}
