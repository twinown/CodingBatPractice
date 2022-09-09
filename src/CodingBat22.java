
/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false*/
public class CodingBat22 {
    public static boolean mixStart(String str) {
        return str.length()>2 && str.startsWith("ix", 1);
    }

    public static void main(String[] args) {
        System.out.println(mixStart("max snacks"));

    }
}
