/*Given a string and a non-empty substring sub, compute recursively the largest
        substring which starts and ends with sub and return its length.
        strDist("catcowcat", "cat") → 9
        strDist("catcowcat", "cow") → 3
        strDist("cccatcowcatxx", "cat") → 9*/
public class CodingBat289 {
    public static int strDist(String str, String sub) {
        if (!str.contains(sub)) {
            return 0;
        }
        if (str.indexOf(sub) == 0 && str.lastIndexOf(sub) == str.length() - sub.length()) {
            return str.length();
        }
        if (str.startsWith(sub)) {
            int i = str.lastIndexOf(sub);
            return strDist(str.substring(0, i + sub.length()), sub);
        } else return strDist(str.substring(1), sub);
    }

    public static void main(String[] args) {
        //    System.out.println("cccatcowcatxx".lastIndexOf("cat"));
        System.out.println(strDist("catcowcat", "cow"));
    }
}
