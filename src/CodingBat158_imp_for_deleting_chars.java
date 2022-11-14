/*Given a string, return a new string made of every other char
        starting with the first, so "Hello" yields "Hlo".
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"*/
public class CodingBat158_imp_for_deleting_chars {
    public static String stringBits(String str) {
        String str2 = "";
        for (int i = 0; i <str.length(); i ++) {
            if (i%2==0) {
                str2 += str.charAt(i);
            }
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }
}
