
/*Given a string, if the string "del" appears starting at index 1, return a string
where that "del" has been deleted. Otherwise, return the string unchanged.
        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"*/
public class CodingBat21 {
    public static String delDel(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str.length()>=4){
            if (stringBuilder.substring(1,4).equals("del")) {
                return stringBuilder.delete(1,4).toString();
            } else return str;
        } else return str;
    }
}
