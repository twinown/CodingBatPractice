/*A sandwich is two pieces of bread with something in between. Return the string that is between the first
        and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""*/
public class CodingBat194_zapomni {
    //моё решение тяжёлое
    public static String getSandwich(String str) {
        int d = str.indexOf('d');
        int count = 0;
        int b = 0;
        for (int i = 0; i <= str.length() - 5; i++) {
            if (str.charAt(i) == 'b' && str.startsWith("read", i + 1)) {
                count++;
                b = i;
            }
        }
        return count >= 2 ? str.substring(d + 1, b) : "";

        //более простое и топовое решение не моё
     /*   int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        return first == last?"":str.substring(first + 5, last);*/
    }


    public static void main(String[] args) {
        String mm = "abdddab";

        System.out.println(mm.lastIndexOf("ab"));
    }
}

