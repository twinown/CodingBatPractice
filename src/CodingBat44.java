/*Given a string, return a string length 1 from its front,
        unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"*/
public class CodingBat44 {
    public static String theEnd(String str, boolean front) {
            return front ? str.substring(0,1) :
                    str.substring(str.length()-1);

    }

}
