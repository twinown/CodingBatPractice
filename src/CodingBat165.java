/*
Given a string, return a version where all the "x" have been removed.
        Except an "x" at the very start or end should not be removed.
        stringX("xxHxix") → "xHix"
        stringX("abxxxcd") → "abcd"
        stringX("xabxxxcdx") → "xabcdx"*/
public class CodingBat165 {
    public static String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }
}
