/*Given a non-empty string like "Code" return a string like "CCoCodCode".
        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"*/
public class CodingBat159 {
    public static String stringSplosion(String str) {
        String str2 = "";
        for (int i = 0; i <= str.length() ; i ++) {
            str2 += str.substring(0,i);
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }
}
