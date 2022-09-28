/*Given a string, if the first or last chars are 'x',
        return the string without those 'x' chars, and otherwise return the string unchanged.
        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"*/
public class CodingBat63 {
    public String withoutX(String str) {
        return str.length()<=1?"":
                str.charAt(0)=='x' &&str.charAt(str.length()-1) == 'x'?
                        str.substring(1,str.length()-1):
                        str.charAt(0)=='x'? str.substring(1):
                                str.charAt(str.length()-1) == 'x'? str.substring(0,str.length()-1)
                                        :str;
    }
}
