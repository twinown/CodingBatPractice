
/*Given a string, return true if it ends in "ly".
        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false*/
public class CodingBat47 {
    public boolean endsLy(String str) {
        return str.length()>1 &&
                str.substring(str.length()-2).equals("ly");
    }
}
