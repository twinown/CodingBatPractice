
/*
Given a string, if the string begins with "red" or "blue" return
        that color string, otherwise return the empty string.
        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
*/
public class CodingBat57 {
    public String seeColor(String str) {
        return str.startsWith("red",0)? "red":
                str.startsWith("blue", 0)? "blue":
                        "";
    }

}
