/*
Return a version of the given string, where for every star (*) in the string the star and the chars
        immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"*/
public class CodingBat198_using_regex_wow_ {

    public static String starOut(String str) {

        //символ звёздочка и
      //  w - буквенно-цифровой символ или знак подчёркивания
        //  ? - один или отсутствует (количество)
        return str.replaceAll("\\w?\\*\\w?",
                "");
    }

    public static void main(String[] args) {
        System.out.println(starOut("sm***eil*ly"));
    }
}
