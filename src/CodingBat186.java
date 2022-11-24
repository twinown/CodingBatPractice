
/*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        bobThere("abcbob") → true
        bobThere("b9b") → true
        bobThere("bac") → false*/
public class CodingBat186 {
    public boolean bobThere(String str) {
        boolean b = false;
        for (int i = 0; i<=str.length()-3;i++){
            if (str.startsWith("b", i) && str.charAt(i + 2) == 'b') {
                b = true;
                break;
            }
        }
        return b;
    }
}
