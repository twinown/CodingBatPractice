/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"*/
public class CodingBat53 {
    public String atFirst(String str) {
        return str.length()==0?"@@":str.length()<2?
                str.substring(0)+"@":str.substring(0,2);
    }
}
