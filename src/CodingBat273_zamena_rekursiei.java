/*Given a string, compute recursively (no loops) a new string where all
        the lowercase 'x' chars have been changed to 'y' chars.
        changeXY("codex") → "codey"
        changeXY("xxhixx") → "yyhiyy"
        changeXY("xhixhix") → "yhiyhiy"
        Go...Save,*/
public class CodingBat273_zamena_rekursiei {

    //бесполезная хрень
    public static String changeXY(String str) {
        if (str.equals("")) return str;
        if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));

    }

    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
    }
}
