/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have
        been reduced to a single char. So "yyzzza" yields "yza".
        stringClean("yyzzza") → "yza"
        stringClean("abbbcdd") → "abcd"
        stringClean("Hello") → "Helo"*/
public class CodingBat283_udalenie_odinakovih_bukv_iz_slova {
    public static String stringClean(String str) {
        String s= "";
        if (str.length()>=2) {
            if (str.charAt(0) != str.charAt(1)) {
                s += str.charAt(0);
                return  s + stringClean(str.substring(1));
            } else {
                  str = stringClean(str.substring(1));
            }
        }
       return str;
    }

    public static void main(String[] args) {
        System.out.println(stringClean("Hello"));
    }
}
