/*Given a string, return a string where every appearance of the lowercase word "is" has
        been replaced with "is not". The word "is" should not be immediately preceeded
        or followed by a letter -- so for example the "is" in "this" does not count.
        (Note: Character.isLetter(char) tests if a char is a letter.)
        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"*/
public class CodingBat254_STRING_TO_LIST_regex_WORD {

    public static String notReplace(String str) {
        str = str.replaceAll("\\bis\\b", "is not");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(notReplace("isis-is"));
    }
}

//solution which doesnot work
/*List<String> list;
        if(str.contains("-")){
        list = new ArrayList<>(Arrays.asList(str.split("-")));
        } else {
        list = new ArrayList<>(Arrays.asList(str.split(" ")));
        }
        for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals("is")) {
        list.set(i, "is not");
        }
        }
        str = list.toString().replaceAll("[^A-Za-z -]","");
        return str;*/

