/*Given a string, return a string where every appearance of the lowercase word "is" has
        been replaced with "is not". The word "is" should not be immediately preceeded
        or followed by a letter -- so for example the "is" in "this" does not count.
        (Note: Character.isLetter(char) tests if a char is a letter.)
        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"*/
public class CodingBat254_NE_SMOG_NE_SDELAL {

    public static String notReplace(String str) {
        //solution with regex(not mine)

          //str = str.replaceAll("(?<=\\s|^|\\W)is(?=\\s|$|\\W)", "is not");
           return str;

        //solution which doesnot work
       /* String s = str;
        str = str.replace("is", "*");
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.startsWith(" ", i + 1) && str.startsWith(" ", i - 1)) {
                str = str.replaceAll("\\s[*]\\s", " is not ");
                if (str.charAt(str.length() - 1) == '*') {
                    str = str.replaceAll("\\s[*]", " is not");
                }
                str = str.replace("*", "is");
            } else if (str.charAt(i - 1) == '*' && str.startsWith(" ", i) && str.charAt(i + 1) != '*') {
                if (str.charAt(str.length() - 1) != '*' || s.charAt(0) == 'i') {
                    str = str.replaceAll("[*]\\s", "is not ");
                }
                str = str.replace("*", "is");
            } else if (str.charAt(i + 1) == '*' && str.startsWith(" ", i) && (str.charAt(i + 1) != '*'
                    || (s.charAt(s.length() - 1) == 's' && (s.charAt(s.length() - 2) == 'i')))) {
                str = str.replaceAll("\\s[*]", " is not");
                str = str.replace("*", "is");
            }
        }
        if (str.contains("-") || str.length() == 1) {
            str = str.replace("*", "is not");
        } else if (str.contains("**")) {
            str = str.replace("*", "is");
        }
        return str;*/

    }

    public static void main(String[] args) {
        System.out.println(notReplace("is"));
    }
}
